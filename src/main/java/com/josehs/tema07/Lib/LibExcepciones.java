package com.josehs.tema07.Lib;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LibExcepciones {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println();
    }
    
    public static int leerEnteroPasandoPelota(String mensaje, int min, int max) {
        boolean valido = false;
        int numero2;
        System.out.println(mensaje);
        numero2 = Integer.parseInt(scanner.nextLine());
        valido = numero2 >= min && numero2 <= max;
        if (!valido) {
            System.err.println("El numero debe estar entre "+min+" y "+max);
        }
        return numero2;
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
                    System.err.println("El numero debe estar entre "+min+" y "+max);
                }
            } catch (InputMismatchException nfe) {
                System.err.println("Solo numeros por favor");
            }
        } while (!valido);
        return numero;
    }
}
