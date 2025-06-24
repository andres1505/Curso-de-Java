package For;

public class For {
    public static void main(String[] args){
        //for nos sirve para iterar elementos o numeros
        String[] textos = {"Hola mundo", "Usuario1","Gordo feliz"};

        /**
         * En un for en java se declara primero la variable luego la condicion y luego ahi mismo se itera el valor de i
         */
        for (int i = 0; i < 5; i++){
            System.out.println("Hola mundo " + i);
        }
        System.out.println("Estamos fuera del for");
    }
}
