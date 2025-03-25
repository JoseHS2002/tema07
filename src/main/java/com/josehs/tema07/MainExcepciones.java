package com.josehs.tema07;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class MainExcepciones {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int numero = leerEntero("Dime un número", 0, 100);

        try {
            int numero2 = leerEnteroPasandoLaPelota("Dime otro número", 0, 100);
        } catch (NumberFormatException nfe) {
            System.err.println("Sólo números por favor");
        }

        System.out.println(numero);
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
