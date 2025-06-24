package Refactorizacion;

import java.util.Scanner;

public class Refactorizacion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";

        //Refactorizamos usando metodos

        //Aca refactorizamos el codigo de ejercicio 2 es decir reestructurar el codigo existente para hacerlo mas sencillo y facil de entender sin cambiar su comportamiento

        //While principal de la aplicacion
        //Terminal hace que al seleccionar la opcion 3 el bucle while se detenga y no solo el switch
        terminal:
        while (true) {
            mostrarOpciones();
            input = scanner.next().toLowerCase();

            switch (input) {
                case "1":
                    //pasamos como argumento el scanner
                    int resultado = calculadora(scanner);//capturamos el valor que devuelve
                    System.out.println("El resultado es: ");
                    System.out.println(resultado);
                    break;

                case "2":
                    hackearNasa();
                    break;

                case "3":
                    System.out.println("Gracias por utilizar el programa");
                    break terminal;
                default:
                    System.out.println("Opcion Incorrecta, Ingrese una opcion disponible");
            }
        }
    }

    static void mostrarOpciones(){
        System.out.println("Ingresa una Opcion: ");
        System.out.println("1. Calculadora");
        System.out.println("2. Hackear la nasa \uD83D\uDE80");
        System.out.println("3. Salir.");
    }
    static int calculadora(Scanner scanner){//Le pasamos el scanner como parametro
        System.out.println("Ingresa un numero: ");
        int num1 = scanner.nextInt();
        System.out.println("Ingresa otro numero: ");
        int num2 = scanner.nextInt();
        return num1 + num2;//devolvemos el valor de la suma
    };
    static void hackearNasa(){
        System.out.println("Hackeando la Nasa \uD83D\uDE80");
        System.out.println("\uD83D\uDE80" + "\uD83D\uDE80" + "\uD83D\uDE80");
        System.out.println("\uD83D\uDE80" + "\uD83D\uDE80");
        System.out.println("\uD83D\uDE80");
        System.out.println("La Nasa ha sido Hackeada \uD83D\uDE14");
    }
}
