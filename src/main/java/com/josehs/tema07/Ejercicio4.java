package com.josehs.tema07;

import java.util.Scanner;
import java.util.InputMismatchException;
//Comprobar el funcionamiento de algunas excepciones
public class Ejercicio4 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("1: Introducir 5 numeros\n2: Sobrepasar la capacidad del array\n3: Array nulo");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1 ->{
                int[] array1 = new int[5];
                llenarArray(array1);
            }

            case 2 ->{
                int[] array2 = new int[3];
                llenarArray(array2);
            }

            case 3 -> {
                int[] array3 = null;
                llenarArray(array3);
            }
        }
    }

    public static void llenarArray(int[] array) {
        if (array == null) {
            System.out.println("El array no está creado o le falta espacio.");
            return;
        }

        int i = 0;
        while (i < array.length) {
            try {
                System.out.print("Introduce un número entero: ");
                array[i] = scanner.nextInt();
                i++;
            } catch (InputMismatchException ime) {
                System.out.println("Debes introducir un número entero.");
                scanner.nextLine();
            } catch (ArrayIndexOutOfBoundsException aioobe) {
                System.out.println("Se ha sobrepasado la capacidad del array.");
                break;
            }
        }

        System.out.println("Contenido del array:");
        for (int num : array) {
            System.out.print(num + "; ");
        }
        System.out.println();
    }
}
