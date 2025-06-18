package OperadoresMatematicos;

public class OperadoresMatematicos {
    public static void main(String[] args){

        int suma = 2 + 2;
        int resta = 2 - 2;
        int multiplicacion = 3 * 3;
        float division = 10f / 3f; // en divisiones es muy importante colocarle la f a los datos, con double nos da mas decimales
        int modulo = 4 % 3; //me indica el resto de la division

        int x = 5;
        // x++; esta linea indica que vamos a aumentar el valor de x en 1
        /*

        ++x; si pongo el ++ antes de la x se incrementa su valor y luego se le pasa al metodo
        x++; de lo contrario que si el ++ lo pongo despues de la x se pasa primero al metodo y luego se suma
         */
        //int y = x++;
        // x = x + 5; se incrementa el valor de 5 pero hay una forma mas optima
        x += 5; //es lo mismo de arriba pero mejor y se puede realizar con todos los operadores
        System.out.println(x);
        //System.out.println(y);
        System.out.println(division);

    }
}
