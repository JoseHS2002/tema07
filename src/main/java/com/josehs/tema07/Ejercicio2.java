package com.josehs.tema07;

import java.util.Scanner;
import java.util.InputMismatchException;
//Escribir 10 numeros con decimales
public class Ejercicio2 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        solicitarTenDecimales();
    }

    public static void solicitarTenDecimales() {
        double nMAlto = Double.MIN_VALUE;
        int contador = 0;
        double numero;
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingresa un número: ");
            try {
                numero = scanner.nextDouble();
                if (numero > nMAlto) {
                    nMAlto = numero;
                }
            } catch (InputMismatchException ime) {
                System.out.println("Entrada inválida. Solo números");
                scanner.nextLine();
                contador++;
                i--;
            }
        }
        System.out.println(nMAlto+" es el numero más alto");
        System.out.println("Se han intentado insertar "+contador+" letras");
        scanner.close();
    }
}
