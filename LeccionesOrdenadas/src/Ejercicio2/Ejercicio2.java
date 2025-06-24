package Ejercicio2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String input = "";

        //While principal de la aplicacion
        //Terminal hace que al seleccionar la opcion 3 el bucle while se detenga y no solo el switch
        terminal: while (true){
            System.out.println("Ingresa una Opcion: ");
            System.out.println("1. Calculadora");
            System.out.println("2. Hackear la nasa \uD83D\uDE80");
            System.out.println("3. Salir.");

            input = scanner.next().toLowerCase();

            switch (input){
                case "1":
                    System.out.println("Ingresa un numero: ");
                    int num1 = scanner.nextInt();
                    System.out.println("Ingresa otro numero: ");
                    int num2 = scanner.nextInt();
                    System.out.println("La suma es: " + (num1+num2));
                    break;

                case "2":
                    System.out.println("Hackeando la Nasa \uD83D\uDE80");
                    System.out.println("\uD83D\uDE80" + "\uD83D\uDE80" + "\uD83D\uDE80");
                    System.out.println("\uD83D\uDE80" + "\uD83D\uDE80");
                    System.out.println("\uD83D\uDE80");
                    System.out.println("La Nasa ha sido Hackeada \uD83D\uDE14");
                    break;

                case "3":
                    System.out.println("Gracias por utilizar el programa");
                    break terminal;
                default:
                    System.out.println("Opcion Incorrecta, Ingrese una opcion disponible");
            }


        }
    }
}
