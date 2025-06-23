package CondicionalIF;

public class CondicionalIf {
    public static void main (String[] args){
        int edad = 18;
        String movieClasification = "R18";
        boolean isRestricted = movieClasification.contains("R");
        boolean isWithAdult = true;

        if (!isRestricted) {
            System.out.println("Puedes ver la pelicula");
        } else if (edad > 17) {
            System.out.println("Puedes ver la pelicula igual");
        } else if (isWithAdult && movieClasification.contains("RP")) {
            System.out.println("Viene con un adulto, puedes entrar");
        } else {
            System.out.println("No puedes ver la pelicula");
        }
    }
}
