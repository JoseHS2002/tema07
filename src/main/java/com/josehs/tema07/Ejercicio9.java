package com.josehs.tema07;

public class Ejercicio9 {
    public static void main(String[] args) {

        try {
            //Intentar dividir por 0
            System.out.println("Intentar dividir por 0");
            double resultado = 10 / 0;
            System.out.println("Resultado de la división: " + resultado);
        } catch (ExcepcionesAritmeticas ea) {
            System.out.println("No se puede dividir por 0");
        }

        try {
            //Intentar acceder a un objeto nulo
            System.out.println("Intentar acceder a un objeto nulo");
            String cadena = null;
            System.out.println("Longitud de la cadena: " + cadena.length());
        } catch (ExcepcionPunteroNulo epn) {
            System.out.println("No se puede acceder a un objeto nulo.");
        }

        try {
            //Intentar introducir un indice fuera del rango de arreglo
            System.out.println("Intentar introducir un indice fuera del rango de arreglo");
            int[] arreglo = {1, 2, 3};
            System.out.println("Elemento en la posición 4: " + arreglo[4]);
        } catch (ExcepcionFueraRango efr) {
            System.out.println("Índice fuera del rango del arreglo.");
        }
    }










    static class ExcepcionesAritmeticas extends ArithmeticException {
        public ExcepcionesAritmeticas(String mensaje) {
            super(mensaje);
        }
    }

    static class ExcepcionPunteroNulo extends NullPointerException {
        public ExcepcionPunteroNulo(String mensaje) {
            super(mensaje);
        }
    }

    static class ExcepcionFueraRango extends IndexOutOfBoundsException {
        public ExcepcionFueraRango(String mensaje) {
            super(mensaje);
        }
    }
}
