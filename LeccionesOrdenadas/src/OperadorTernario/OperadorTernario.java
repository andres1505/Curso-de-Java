package OperadorTernario;

public class OperadorTernario {
    public static void main (String[] args){
        int edad = 25;

        //.............condicion...si es True...................Si es False
        String mensaje = edad > 17 ? "Esta persona puede votar": "Esta persona no puede votar";

        /**
         * variable = (condicion) ? valor si es true : valor si es false
         */

        System.out.println(mensaje);
    }
}
