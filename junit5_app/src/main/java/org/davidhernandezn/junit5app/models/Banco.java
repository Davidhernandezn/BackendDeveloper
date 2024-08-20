package org.davidhernandezn.junit5app.models;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<Cuenta> cuentas;
    private String nombre;

    public String getNombre() {
        return nombre;
    }
    
    public Banco() {
    	this.cuentas = new ArrayList<>();	// Inicializa la lista de cuentas
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Cuenta> getCuentas() {
        return cuentas;
    }

    public void setCuentas(List<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }

    public void addCuenta(Cuenta cuenta){
        cuentas.add(cuenta);
    }

    
    public void transferir(Cuenta origen, Cuenta destino, BigDecimal monto){
        origen.debito(monto);//ENVIA
        destino.credito(monto);//RECIBE DEPOSITO

    }
}
