package ReferenciaVSPrmitivo;

import java.awt.*;

public class ReferenciaVSPrimitivo {
    public static void main(String[] args){
        int a = 15;
        int b = a;

        b = 33;
        System.out.println(a); //imprime 15 por lo que son vaiables primitivas

        //Planos = Point ↓ Casa= point
        Point point1 = new Point(); //Nueva instancia de la clase Point
        Point point2 = point1;
        point2.x = 15;
        System.out.println(point1);//Variables por referencia
        /**
         * En point no se guarda el objeto en memoria, lo que se guarda es la direccion de memoria la cual se va a encargar de contener todas las cosas que construyen este objeto de point
         * cuando se crea otra variable en base a la primera ambas apuntan a la misma direccion entonces si modifico una u otra modifico el objeto no el espacio en memoria
         */

        /**
         * Hay tipos de datos de referencia que son inmutables que nos van a devolver una instancia del objeto
         * Por ende nos van a devolver otra referencia o otra variable que apunta a otro espacio de memoria
         * EJEMPLO:
         */
        //Los Strings son tipos de datos de referencia
        String c = new String("Hola mundo");
        String d = c;
        String e = c.toUpperCase();
        System.out.println(e);
        /**
         * Para saber si un metodo es inmutable o no, es si nosotros llamamos al metodo y nos devuelve una nueva variable y nos duelve valores distintos en ese caso es inmutable
         */

    }
}
