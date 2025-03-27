package com.josehs.tema07;

import java.util.Scanner;

public class Ejercicio6 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Dime un numero entero");
        int numero = scanner.nextInt();
        int[] array = {-2, -1, 0, 1, 2};

        dividirArrays(numero, array);
        dividirArraysSE(numero, array);
    }

    public static void dividirArrays(int numero, int[] array) {
        for (int i = 0; i < array.length; i++) {
            try {
                int resultado = numero / array[i];
                System.out.println(numero + " / " + array[i] + " = " + resultado);
            } catch (ArithmeticException e) {
                System.out.println("No se puede dividir entre 0.");
            }
        }
    }

    public static void dividirArraysSE(int numero, int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                int resultado = numero / array[i];
                System.out.println(numero + " / " + array[i] + " = " + resultado);
            } else {
                System.out.println("No se puede dividir entre 0.");
            }
        }
    }
}
