package org.davidhernandezn.junit5app.models;

import org.davidhernandezn.junit5app.exceptions.DineroInsuficionenteException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

//USA DEFAULT -
class CuentaTest {

    @Test //PARA INDICAR QUE SE DEBE EJECUTAR
    void testNombreCuenta(){

        //INSTANCIAR
        Cuenta cuenta = new Cuenta("Andres", new BigDecimal("10004.3234"));
        //cuenta.setPersona("Andres");//PARA VER SI ESTAMOS PASANDO BIEN EL PARAMETRO
        String esperado = "Andres";
        String real = cuenta.getPersona();
        assertNotNull(real);

        //MIENTRAS NO HAYA AFIRMACIONES (ASERTIONS SERA VALIDO)
        //Assertions.assertEquals(esperado, real);
        //assertEquals(esperado, real);
        assertTrue(real.equals("Andres"));
    }


    @Test
    void testSaldoCuenta(){
        Cuenta cuenta = new Cuenta("Andres", new BigDecimal("1004.12345"));
        assertNotNull(cuenta.getSaldo());
        assertEquals(1004.12345, cuenta.getSaldo().doubleValue());//Verifica que se an datos iguales
        assertFalse(cuenta.getSaldo().compareTo(BigDecimal.ZERO) < 0);//Verifica que el saldo de la cuenta no sea negativo.
        assertTrue(cuenta.getSaldo().compareTo(BigDecimal.ZERO) > 0);//Verifica que el saldo de la cuenta sea positivo.
    }

    @Test
    void  testReferenciaCuenta(){
        Cuenta cuenta = new Cuenta("Andres", new BigDecimal("1004.12345"));
        Cuenta cuenta2 = new Cuenta("Andres", new BigDecimal("1004.12345"));

        //assertNotEquals(cuenta2, cuenta); //VERIFICAR QUE NO SEAN EL MISMO OBJETO EN MEMORIA

        //VALIDAR QUE SEA EL MISMO OBJETO
        assertEquals(cuenta, cuenta2); //(INSTANCIA - DIFERENTES ESPACIOS DE MEMORIA)

        //COMPARAR POR VALOR
        /*1- EN CLASE MODEL, VALIDAR OBJETO
         *2- VALIDAR ATRIBUTOS SI SON NULOS
         *3- Compara y RETORNAR por valor de objeto
         *4- HACER EL TEST DEL
         * */

    }

    @Test
    void testDebitoCuenta() {
        //INSTANCIAMOS E INICIALIZAMOS VALORES
        Cuenta cuenta = new Cuenta("Andres", new BigDecimal("1000.12345"));
        //INDICAMOS EL VALOR A GASTAR
        cuenta.debito(new BigDecimal(100));
        //VALIDA QUE NO SEA NULO
        assertNotNull(cuenta.getSaldo());
        assertEquals(900, cuenta.getSaldo().intValue());//valor esperado
        assertEquals("900.12345",cuenta.getSaldo().toPlainString());//VALOR ESPERADO REAL
    }


    @Test
    void testCreditoCuenta() {
        Cuenta cuenta = new Cuenta("Andres", new BigDecimal("1000.12345"));
        cuenta.credito(new BigDecimal(100));
        assertNotNull(cuenta.getSaldo());
        assertEquals(1100, cuenta.getSaldo().intValue());//valor esperado
        assertEquals("1100.12345",cuenta.getSaldo().toPlainString());
    }

    @Test
    void testDineroInsuficienteExceptionCuenta(){
        Cuenta cuenta = new Cuenta("Andres", new BigDecimal("1000.12345"));
        //DEVUELVE OBJETO EXCEPTION el cual obtenemos mensaje
        Exception exception = assertThrows(DineroInsuficionenteException.class,()->{
            cuenta.debito(new BigDecimal(1500));
        });

        String actual = exception.getMessage();
        String esperado = "Dinero Insuficiente";
        assertEquals(esperado, actual);
    }

    @Test
    void testTransferirDineroCuentas(){
        Cuenta cuenta1 = new Cuenta("Jhon", new BigDecimal("2500"));
        Cuenta cuenta2 = new Cuenta("Andres", new BigDecimal("1500.8989"));

        Banco banco = new Banco();
        banco.setNombre("Banco del Estado");
        banco.transferir(cuenta2,cuenta1,new BigDecimal(500));
        assertEquals("1000.8989",cuenta2.getSaldo().toPlainString());
        assertEquals("3000", cuenta1.getSaldo().toPlainString());
    }

    @Test
    void testRelacionBancoCuentas(){
        Cuenta cuenta1 = new Cuenta("Jhon", new BigDecimal("2500"));
        Cuenta cuenta2 = new Cuenta("Andres", new BigDecimal("1500.8989"));

        Banco banco = new Banco();
        banco.addCuenta(cuenta1);
        banco.addCuenta(cuenta2);
        
        banco.setNombre("Banco del Estado");
        banco.transferir(cuenta2,cuenta1,new BigDecimal(500));
        
        assertEquals("1000.8989",cuenta2.getSaldo().toPlainString());
        assertEquals("3000", cuenta1.getSaldo().toPlainString());

        //BANCO TIENE 2 CUENTAS //VALOR ESPERADO,  
        assertEquals(2,banco.getCuentas().size());
        //Debemos tener la relacion inversa al hacer test
        assertEquals("Banco del Estado", cuenta1.getBanco().getNombre());   
        
        //Stream QUE PERTENESCA A TAL PERSONA
        //VALOR ESPERADO
        assertEquals("Andres", banco.getCuentas().stream()
        		.filter(c -> c.getPersona().equals("Andres"))
        		.findFirst() //BUSCAR PRIMERO, DEVUELVE OPCIONAL
        		.get().getPersona());
        
 /**  FORMA 1     assertEquaLs(banco.getCuentas().stream()
        		.filter(c -> c.getPersona().equals("Andres"))
        		.findFirst().isPresent(); //BUSCAR PRIMERO, DEVUELVE OPCIONAL**/
    //FORMA 2
        assertTrue(banco.getCuentas().stream()
        		.anyMatch(c -> c.getPersona().equals("Andres"))); 
    }
}
