package ClaseMath;

public class ClaseMath {
    public static void main(String[] args){
        //el metodo Math.abs me devuelve el valor adsoluto de un numero
        System.out.println(Math.abs(-15));//El metodo mas se encuentra overloaded, esto quiere decir que el metodo ha sido implementado muchas veces para poder aceptar distintos tipos de datos

        //Math es una clase mientras que .ceil es un metodo
        System.out.println(Math.ceil(10.0001));//El metodo Math.ceil toma un numero y lo redondea al valor de mas arriba en este caso 11

        System.out.println(Math.floor(10.9999));// El metodo floor de la clase Math redondea el numero al valor de mas abajo en este caso 10

        System.out.println(Math.max(15, 25));//El metodo max me devulve cual de los dos numeros es el mayor

        System.out.println(Math.min(15, 25));//El metodo min me devulve cual de los dos numeros es el menor

        System.out.println(Math.round(15.5));//El metodo round toma un numero cualquiera y lo redondea al numero mas cercano

        double random = Math.random();//El metodo random me devuelve un numero aleatorio entre 0 y 1
        System.out.println((int) (random * 100));//numero aleatorio entre 0 y 100
    }
}
