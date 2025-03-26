package com.josehs.tema07;

import com.josehs.tema07.Lib.IO;
import com.josehs.tema07.exceptions.InvalidPlateException;
import com.josehs.tema07.exceptions.InvalidPlateLengthException;
import com.josehs.tema07.exceptions.InvalidPlateLettersException;
import com.josehs.tema07.exceptions.InvalidPlateNumberException;

import java.util.Scanner;

public class MainExcepciones {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        /*
        String matricula = IO.leerString("Dime la matricula", 8, 100);
        try {
            IO.validarMatricula(matricula);
        } catch (InvalidPlateException ipe) {
            System.out.println(ipe);
        } catch (InvalidPlateLengthException iple) {
            System.out.println(iple);
        } catch (InvalidPlateLettersException iplte) {
            System.out.println(iplte);
        } catch (InvalidPlateNumberException ipne) {
            System.out.println(ipne);
        }

         */
        /*
        int numero = leerEntero("Dime un número", 0, 100);

        try {
            int numero2 = leerEnteroPasandoLaPelota("Dime otro número", 0, 100);
        } catch (NumberFormatException nfe) {
            System.err.println("Sólo números por favor");
        }

        System.out.println(numero);

         */
    }

    public static int leerEnteroPasandoLaPelota(String mensaje, int min, int max) {
        boolean valido;
        int numero;
        System.out.println(mensaje);
        numero = Integer.parseInt(scanner.nextLine());
        valido = numero >= min && numero <= max;
        if (!valido) {
            System.err.println("El número debe estar entre " + min + " y " + max);
        }
        return numero;
    }

    public static int leerEntero(String mensaje, int min, int max) {
        boolean valido = false;
        int numero = Integer.MIN_VALUE;
        do {
            try {
                System.out.println(mensaje);
                numero = Integer.parseInt(scanner.nextLine());
                valido = numero >= min && numero <= max;
                if (!valido) {
                    System.err.println("El número debe estar entre " + min + " y " + max);
                }
            } catch (NumberFormatException nfe) {
                System.err.println("Sólo números por favor");
            }
        } while (!valido);
        return numero;
    }
}
