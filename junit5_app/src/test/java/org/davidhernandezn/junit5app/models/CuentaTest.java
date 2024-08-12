package org.davidhernandezn.junit5app.models;

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
}