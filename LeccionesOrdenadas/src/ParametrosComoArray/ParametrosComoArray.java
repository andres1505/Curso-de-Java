package ParametrosComoArray;

public class ParametrosComoArray {
    public static void main(String[] args){

        //Aca tambien debemos declarar que es un array de numeros enteros
        int r = suma(new int[]{1, 2,3,4,5});

        System.out.println(r);
    }
    //Esto es para momentos donde no sabemos cuantos argumentos le queremos pasar al metodo

    //Recibe como parametro un arreglo de enteros
    static int suma(int[] numeros){
        int resultado = 0;
        for (int numero: numeros){
            resultado += numero;//Resultado va a ser igual a si mismo sumando numero es decir el elemento del array
        }
        return resultado;
    }
}
