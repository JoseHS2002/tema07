package com.josehs.tema07;

public class Ejercicio8 {
    public static void main(String[] args) {

        try {
            //Intentar dividir por 0
            System.out.println("Intentar dividir por 0");
            double resultado = 10 / 0;
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException ae) {
            System.out.println("¡Se ha producido una ArithmeticException!.");
        }

        try {
            //Intentar acceder a un objeto nulo
            System.out.println("Intentar acceder a un objeto nulo");
            String cadena = null;
            System.out.println("Longitud del string: " + cadena.length());
        } catch (NullPointerException npe) {
            System.out.println("¡Se ha producido una NullPointerException!.");
        }

        try {
            //Intentar introducir un indice fuera del rango de arreglo
            System.out.println("Intentar introducir un indice fuera del rango de arreglo");
            int[] arreglo = {1, 2, 3};
            System.out.println("Elemento en una posición inexistente: " + arreglo[4]);
        } catch (IndexOutOfBoundsException ioobe) {
            System.out.println("¡Se ha producido una IndexOutOfBoundsException!.");
        }

    }
}
