package Alcance;

public class Alcance {
    public static void main (String[] args){
        String mensaje = "Crack para programar";

        //En desarrollo real un if no va a tener un true o false como evaluacion pero esto es para entender el concepto
        if (true){
            String texto = "Hola mundozzzzz";
            System.out.println(mensaje);
            System.out.println(texto);
            mensaje = "Hola mundo";
            System.out.println(mensaje);

            if (true){
                System.out.println(texto);
            }
        }
        /*
        Cada vez que queremos declarar una variable esta debe estar al mismo nivel del bloque de codigo al cual queremos acceder
         */
        System.out.println("Fin de la aplicacion");

    }
}
