package AlcanceMetodos;

public class AlcanceMetodos {

    //Al alcance hacemos referencia a que solo voy a poder acceder a las cosas que se encuentren dentro de cada metodo

    /**
     *
     * No podemos acceder a nminguna variablle que este declarada fuera del metodo
     * Todos lo metodos creados dentro de main siempre y cuando tengan la palabra reservada de static nosotros los vamos a poder llamar entre estos mismos
     */

    public static void main(String[] args){
        int r = suma(1, 2);

        System.out.println(r);
    }

    static int suma(int a, int b){
        return  a+b;
    }
    //No caer en llamado de funciones circulares

}
