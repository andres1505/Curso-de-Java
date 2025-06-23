package Ejercicio1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ejercicio {
    public static void main (String[] args){
        //Creacion del scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa un numero: ");
        int number = scanner.nextInt();

        if (number % 2 == 0){
            System.out.println("El numero es par");
            if (number % 3 ==0 && number % 4 == 0){
                System.out.println("El numero es divisible por 3 y por 4");
            } else if (number % 3 ==0) {
                System.out.println("El numero es divisible por 3");
            } else if (number % 4 ==0) {
                System.out.println("El numero es divisible por 4");
            }
        }
        else {
            System.out.println("El numero es impar");
            if (number % 3 == 0){
                System.out.println("El numero es divisible por 3");

            }
        }

        //Otra solucion
        System.out.println("Segunda solucion");
        int numero = scanner.nextInt();
        if (number % 2 == 0){
            System.out.println("el numero es par");
        } else {
            System.out.println("El numero es impar");
        }

        //En este caso siempre se pone la condicion mas especifica de primero
        if (numero % 3 ==0 && numero % 4 ==0 ) {
            System.out.println("El numero es divisible por 3 y 4");
        } else if (numero % 4 ==0){
            System.out.println("El numero es divisible por 4");
        } else if (numero % 3 ==0){
            System.out.println("El numero es divisible por 3");
        }



    }
}
