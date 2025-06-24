package While;

public class While {
    public static void main (String[] args){
        //A direfencia del ciclo for nosotros tenemos que inicializar nuestro valor inicial
        int i = 0;

        //Condicion inicial
        while (i < 5){
            System.out.println("Hola mundo " + i);
            i++; //Incrementar el valor de i
        }
        //Este nos sirve para cuando el usuario este escribiendo opciones dentro de una linea de comandos
        System.out.println("Saliendo del Loop");
    }
}
