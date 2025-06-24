package ForEach;

public class ForEach {
    public static void main (String[] args){
        String[] personajes = {"Goku", "Vegeta", "Trunks"};

        for (int i = 0; i < personajes.length; i++){
            System.out.println(personajes[i]);
        }//Forma comun de iterar los elementos de un array

        /**
         * En for Each creamos una nueva variable a partir del array existente y este itera cada uno de los elementos uno a uno;
         */
        System.out.println("FOR EACH");
        for (String personaje: personajes){
            System.out.println(personaje);
        }
    }
}
