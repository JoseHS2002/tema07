package com.josehs.tema07.Lib;

import com.josehs.tema07.exceptions.InvalidPlateException;
import com.josehs.tema07.exceptions.InvalidPlateLengthException;

import java.util.Scanner;

public class IO {
    private static final Scanner scanner = new Scanner(System.in);

    public static String leerString(String mensaje, int minLength, int maxLength) {
        boolean valido;
        String valor;
        do {
            System.out.println(mensaje);
            valor = scanner.nextLine();
            int length = valor.length();
            valido = length >= minLength && length <= maxLength;
            if (!valido) {
                System.out.printf("La longitud debe estar entre %d y %d\n", minLength, maxLength);
            }
        } while (!valido);
        return valor;
    }

    public static boolean validarMatricula(String matricula) throws InvalidPlateLengthException{
        int i;
        if (matricula.length() != 8) {
            throw new InvalidPlateLengthException("La matricula debe tener 8 caracteres");
        }
        for (i = 0; i < 4; i++) {
            if (!Character.isDigit(matricula.charAt(i))) {
                return false;
            }
        }
        if (!Character.isWhitespace(matricula.charAt(i++))) {
            return false;
        }
        for (int j = i; j < matricula.length(); j++) {
            if (!Character.isLetter(matricula.charAt(j))) {
                return false;
            }
        }
        return true;
    }

    /*
    public static void parsearMatricula(String matricula) throws InvalidPlateException{
        if (!validarMatricula(matricula)) {
            throw new InvalidPlateException("La matricula no es valida");
        }
    }

     */
}
