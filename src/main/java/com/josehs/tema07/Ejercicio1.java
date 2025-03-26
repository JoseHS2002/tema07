package com.josehs.tema07;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio1 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

    }

    public static double[] solicitarNumeros(String mensaje) {
        ArrayList<Double> numeros = new ArrayList<>();
        double numero;
        int contador = 1;
        System.out.println(mensaje);
        do {
            try {
                System.out.printf("Dime un numero %d:\n", contador++);
                numero = Double.parseDouble(scanner.nextLine());
                if (numero >= 0) {
                    numeros.add(numero);
                }
            } catch (NumberFormatException nfe) {
                System.out.println("Solo números por favor");
                numero = 1;
            }
        } while (numero >= 0);
        double[] valores = new double[numeros.size()];
        for (int i = 0; i < numeros.size(); i++) {
            valores[i] = numeros.get(i);
        }
        //return (Double[]) (numeros.toArray());
        return valores;
    }
}
