package org.davidhernandezn.junit5app.exceptions;

public class DineroInsuficionenteException extends RuntimeException {

    //CONSTRUCTOR QUE PASE EL MENSAJE PARA PERSONALIZARLO
    public DineroInsuficionenteException(String message) {
        super(message);
    }
}
