package AplicacionTermina;

import java.util.Scanner;

public class AplicacionTerminal {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);
        String input = "";

        //Solamente vamos a salir de este loop, unica y exclusivamente cuando el usuario escriba salir
        while (!input.equals("salir")){
            System.out.println("Ingresa comando: ");
            input = scanner.next().toLowerCase();//Se aplica el LowerCase para poner el texto en minuscula y tomar cualquier cosa que escriba el usuario
            System.out.println(input);
        }
        System.out.println("Termino el Loop");

    }
}
