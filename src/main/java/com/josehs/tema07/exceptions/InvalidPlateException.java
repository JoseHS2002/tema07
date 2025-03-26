package com.josehs.tema07.exceptions;

import java.util.InvalidPropertiesFormatException;

public class InvalidPlateException extends InvalidPropertiesFormatException {
    public InvalidPlateException(String menssage) {
        super(menssage);
    }
}
