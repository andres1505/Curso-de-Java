package PrimeraClase;

public class User {
    //Para crear una propiedad tengo que indicarle el tipo y despues el nombre a la propiedad
    public double id = Math.random();
    public String name; //Propiedades, tengo que declarar publico la propiedad
    public static String tableName = "user";

    //Metodo
    public void saludar(){
        /**
         * Cuando utilizamos this estamos haciendo referencia a una instancia de la clase User
         * this es dinamico va a depender de la instancia que estemos creando
         */

        System.out.println("Hola soy " + this.name);

        //Para acceder a una propiedad static tenemos que hacerlo sin la palabra this
        System.out.println("Nombre de tabla "+ tableName);
    }

    //El metodo constructor es el metodo que se ejecuta apenas nosotros creamos una instancia de una clase
    /**
     * Para crear un metodo constructor tengo que darle exactamente el mismo nombre que el de la clase
     */
    public User(String name){
        this.name = name;
    }
}
