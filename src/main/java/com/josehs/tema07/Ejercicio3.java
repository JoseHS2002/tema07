package com.josehs.tema07;

import java.util.InputMismatchException;
import java.util.Scanner;
//Escribir números hasta que se introduzca una letra
public class Ejercicio3 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        double nMAlto = Integer.MIN_VALUE;
        boolean hayNumeros = false;

        System.out.println("Introduce números (introducir letras finaliza el bucle):");

        double numero = pedirNumero();
        while (numero == scanner.nextDouble()) {
            hayNumeros = true;
            if (numero > nMAlto) {
                nMAlto = numero;
            }
            numero = pedirNumero();
        }

        if (hayNumeros) {
            System.out.println("El número más alto es: " + nMAlto);
        } else {
            System.out.println("No hay ningún número.");
        }
    }

    public static int pedirNumero() {
        double numero = 0;
        try {
            if (scanner.hasNextDouble()) {
                numero = scanner.nextDouble();
            } else {
                scanner.next();
            }
        } catch (InputMismatchException ime) {
            System.out.println("Entrada inválida. Introduce un número válido.");
            scanner.next();
        }
        return (int) numero;
    }

}
