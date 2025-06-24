package ArgumentosyParametros;

public class ArgumentosyParametros {
    public static void main(String[] args){
        miMetodo("Andres", 15);//cuando ejecutamos el metodo tenemos que pasarle el argumento
        miMetodo("Juan", 21);//Argumento
        miMetodo("Nicolas", 14);//Argumento
        //Lo que le pasamos en este bloque de codigo se conoce como argumento
    }

    //Nombre es un parametro y le tenemos que indicar el tipo
    static void miMetodo(String nombre, int edad){
        System.out.println("Hola " + nombre + ", tu edad es: " + edad);//Los parametros son las variables que podemos utilizar dentro de los metodos
        //Los argumentos son los valores que le vamos a pasar cuando nosotros llamemos al metodo
        //Dentro del metodo son parametros
    }
}
