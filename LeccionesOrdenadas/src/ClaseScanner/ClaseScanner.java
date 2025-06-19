package ClaseScanner;

import java.util.Scanner;//Realiza la importacion de forma manual

public class ClaseScanner {
    public static void main(String[] arg){
        //Asi se crea un nuevo Scanner
        Scanner scanner = new Scanner(System.in);//por convencion cada vez que queremos crear una instancia de una clase primero casteamos el nombre de la clase y luego en minuscula con el mismo nombre la variable

        /*
        String valor = scanner.next(); el metodo de next evalua cada una de las palabras separadas como un token y esta clase solo va a tomar el primer token que se encuentre
        System.out.println(valor);
         */
        String valor = scanner.nextLine();//me toma todos los valores sin importar el espacio entre estos
        System.out.println(valor);

        byte valor2 = scanner.nextByte();
        System.out.println(valor2);

        System.out.println("Ingresa tu edad:");
        byte edad = scanner.nextByte();
        System.out.println("tu edad es: " + edad);



    }
}
