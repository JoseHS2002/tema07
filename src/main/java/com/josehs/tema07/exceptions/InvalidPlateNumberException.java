package com.josehs.tema07.exceptions;

import java.util.InvalidPropertiesFormatException;

public class InvalidPlateNumberException extends InvalidPropertiesFormatException {
    public InvalidPlateNumberException(String mesage) {
        super(mesage);
    }
}
