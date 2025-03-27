package com.josehs.tema07;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio5 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        Alumno alumno1 = new Alumno();
        Alumno alumno2 = new Alumno();

        System.out.println("Introduce el primer nombre:");
        alumno1.nombre = scanner.next();

        System.out.println("Introduce la primera edad:");
        alumno1.edad = leerEntero();

        System.out.println("Introduce la primera altura (en cm):");
        alumno1.altura = leerEntero();

        System.out.println("Introduce el segundo nombre:");
        alumno2.nombre = scanner.next();

        System.out.println("Introduce segunda edad:");
        alumno2.edad = leerEntero();

        System.out.println("Introduce la segunda altura (en cm):");
        alumno2.altura = leerEntero();

        System.out.println("\nInformación del primer alumno:");
        System.out.println("Nombre: " + alumno1.nombre);
        System.out.println("Edad: " + alumno1.edad + " años");
        System.out.println("Altura: " + alumno1.altura + " cm| "+(0.0328*alumno1.altura)+"pies");

        System.out.println("\nInformación del segundo alumno:");
        System.out.println("Nombre: " + alumno2.nombre);
        System.out.println("Edad: " + alumno2.edad + " años");
        System.out.println("Altura: " + alumno2.altura + " cm| "+(0.0328* alumno2.altura)+"pies");

        if (alumno1.edad > alumno2.edad) {
            System.out.println("\nEl alumno mayor es: " + alumno1.nombre);
        } else if (alumno2.edad > alumno1.edad) {
            System.out.println("\nEl alumno mayor es: " + alumno2.nombre);
        } else {
            System.out.println("\nLos alumnos tienen la misma edad.");
        }
    }

    private static int leerEntero() {
        int numero = 0;
        boolean entradaValida = false;

        while (!entradaValida) {
            try {
                numero = scanner.nextInt();
                entradaValida = true;
            } catch (InputMismatchException e) {
                System.out.println("Solo se pueden poner numeros.");
                scanner.nextLine();
            }
        }
        return numero;
    }

    static class Alumno {
        String nombre;
        int edad;
        int altura;
    }
}
