package Overloading;

public class Overloading {
    public static void main(String[] args){
        int resultado = suma(15, 27, 45);
        int resultado2 = suma(1,2);
        System.out.println(resultado);
        System.out.println(resultado2);

        String texto = suma();
        System.out.println(texto);
    }

    //Dependiendo de la cantidad de argumentos que le pasemos es el metodo que se va a ejecutar
    static int suma(int a, int b){
        return a + b;
    }

    static int suma(int a, int b, int c){
        return a + b +c;
    }

    static String suma(){
        return "Hola mundo";
    }
    /**
     * Overloading o sobrecarga
     * Significa que vamos a definir el mismo metodo multiples veces pero lo que vamos a hacer es cambiar la cantidad de argumentos que este tiene o tambien el tipo de argumento que le estamos pasando
     */
}
