package CalculadoraBasica;

import java.sql.SQLOutput;
import java.util.Scanner;

public class CalculadoraBasica {
    public static void main(String[] args){
        /**
         * Crear una calculadora que reciba 2 numeros
         * luego imprima el resultado de la suma de estos dos numeros
         */
        int num1 = 0;
        int num2 = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa un numero: ");
        num1 = scanner.nextInt();

        System.out.println("Ingrese el segundo numero");
        num2 = scanner.nextInt();

        int suma = num1 + num2 ;
        System.out.println("La suma de los dos numeros es: "+ suma);

        /**
         * Solucion mejorada
         *
         */
        System.out.println("Esta es una aplicacion de calculadora");
        System.out.println("Ingrese el primer numero: ");
        int valorA = scanner.nextInt();
        System.out.println("Ingrese el segundo numero");
        int valorB = scanner.nextInt();
        System.out.println("El resultado de la suma es: ");
        System.out.println( valorA + valorB);


    }
}
