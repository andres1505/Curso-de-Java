import java.util.Arrays;//este import lo puedo llamar usando la clase "Arrays" y se realiza agrega


public class Main {
    public static void main(String[] args) {
        //las dimensiones del array son fijas
        int[] numeros = new int[5];//para crear un arreglo debo iniciar con new y darle el tamaño
        numeros[0] = 5;//aca agrego el valor 0 en la primera posicion del Array en los arreglos la primera posicion comienza desde el 0

        numeros[4] = 7;

        System.out.println(numeros);//me da como salida una direccion en memoria
        System.out.println(Arrays.toString(numeros));//con esta linea se puede ver como el Array ha sido inicializado

        System.out.println(numeros.length);//esta propiedad me devuelve el tamaño del array

        Arrays.sort(numeros);//ordena el array de menor a mayor. El metodo sort de la clase de Arrays me devuelve "Void" lo que quiere decir que no me devuelve nada

        System.out.println(Arrays.toString(numeros));//esta es una expresion lo que significa que es una linea de codigo que me devuelve un valor

        int[] numbers = {0,1,2,3,4};//esta es la forma mas actual de crear un arreglo
        System.out.println(Arrays.toString(numbers));
        numbers [8] = 15;//esto me lanza una excepcion ya que esta fuera de los limites del arreglo



    }
}