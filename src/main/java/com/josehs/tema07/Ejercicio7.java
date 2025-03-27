package com.josehs.tema07;

import java.util.Scanner;

public class Ejercicio7 {
    //Escribir un texto y mostrar un unico caracter.
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Escribe algo");
        String texto = scanner.next();
        String[] cadenas= {texto};
        mostrarCadenasArray(cadenas);
    }

    public static void mostrarCadenasArray(String[] cadenas) {
        for (String cadena : cadenas) {
            if (cadena != null) {
                System.out.println(cadena.charAt(0));
            }
        }
    }

}
