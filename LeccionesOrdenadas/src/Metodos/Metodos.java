package Metodos;

public class Metodos {
    public static void main(String[] args){
        miMetodo();//Aca llamo el metodo
        otroMetodo();//Este es el otro metodo
    }

    //Aca se crea un nuevo metodo

    /**
     * Lo primero que hacemos es indicar la palabra reservada "Static"
     * Despues el valor de retorno es decir lo que va a devolver el metodo en este caso es void porque no retorna nada
     * luego el nombre del metodo
     * para ejecutarlo llamo el metodo en el main
     * Podemos llamar al metodo las veces que queramos
     * Y podemos crear multiples metodos
     */
    static void miMetodo(){
        System.out.println("Hola mundo");
    }

    static void otroMetodo(){
        System.out.println("NO SEEEEEEEEE");
    }
}
