package org.davidhernandezn.junit5app.models;

import java.math.BigDecimal;

public class Cuenta {
    private String persona;
    private BigDecimal saldo; //BigDecimal O BigInteger - ESPECIAL PARA MANEJO DE DINERO ES INMUTABLE

    //CONSTRUCTOR
    public Cuenta(String persona, BigDecimal saldo) {
        this.persona = persona;
        this.saldo = saldo;
    }

    public String getPersona() {
        return persona;
    }

    public void setPersona(String persona) {
        this.persona = persona;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public void debito(BigDecimal monto){
        //PODEMOS AGREGAR MANEJO DE EXCEPCIONES
    this.saldo = this.saldo.subtract(monto); //Restar agregamos this.saldo por que es inmutable y no refleja el cambio
    }

    public void credito(BigDecimal monto){
        this.saldo = this.saldo.add(monto);//SUMAR, AGREGAR MONTO
    }



    @Override
    public boolean equals(Object obj) {
        //VALIDAMOS OBJETO
        /*instanceof permite verificar si un objeto pertenece a una clase determinada* */
        if (!(obj instanceof Cuenta)){
            //Verifica si el objeto obj es una instancia de la clase Cuenta.
            //Si no es una instancia de Cuenta, devuelve false inmediatamente, ya que no se puede comparar con un objeto de otra clase.
            return false;
        }

        //Si el objeto obj es una instancia de Cuenta, lo convierte a un objeto Cuenta llamado c.
        Cuenta c = (Cuenta) obj;

        //VALIDAR ATRIBUTOS SI SON NULOS
        if (this.persona == null || this.saldo == null){
            return false;
        }

        //Compara los atributos persona y saldo del objeto actual (this) con los atributos correspondientes del objeto c.
        return this.persona.equals(c.getPersona()) && this.saldo.equals(c.getSaldo()); //COMPARA POR OBJETO
    }


}
