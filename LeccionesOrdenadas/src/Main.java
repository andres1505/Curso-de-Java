import PrimeraClase.User;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hola mundo javaaaaa Esto es POO");
        //Este es un objeto de la clase PrimeraClase como ejemplo
        User user = new User("Andres");
        //user.name = "Andres";//Se le declara el nombre
        User user2 = new User("Juan");
        //user2.name = "Juan";// con el "." podemos acceder a las propiedades de este objeto
        System.out.println(user.id);
        System.out.println(user2.id);
        user.saludar();
        user2.saludar();

        //Para poder acceder a table name tengo que acceder desde la clase
        System.out.println(User.tableName);

    }
}