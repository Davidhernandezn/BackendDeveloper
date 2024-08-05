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

        //MIENTRAS NO HAYA AFIRMACIONES (ASERTIONS SERA VALIDO)
        //Assertions.assertEquals(esperado, real);
        //assertEquals(esperado, real);
        assertTrue(real.equals("Andres"));

    }

}