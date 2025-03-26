package com.josehs.tema07.exceptions;

import java.util.InvalidPropertiesFormatException;

public class InvalidPlateLettersException extends InvalidPropertiesFormatException {
    public InvalidPlateLettersException(String mesage) {
        super(mesage);
    }
}
