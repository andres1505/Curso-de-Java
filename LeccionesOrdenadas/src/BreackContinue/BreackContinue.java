package BreackContinue;

import java.util.Scanner;

public class BreackContinue {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        String input = "";

        //Siempre se va a estar ejecutando al menos que hagamos algo en especifico
        while (true){
            System.out.println("Ingresa un comando");
            input = scanner.next().toLowerCase();
            if (input.equals("salir")){
                break;//Esta instruccion termina el bloque de codigo
            }
            if (input.equals("continuar")){
                continue;//Continua el while, desde el principio y comienza la ejecucion de nuevo
            }
            /**
             * Los comandos break y continue se ejecutan solo en loops
             */
            System.out.println("Esta linea no se deberia ejecutar");
        }
        System.out.println("Termino el Loop");
    }
}
