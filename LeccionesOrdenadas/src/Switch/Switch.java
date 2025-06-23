package Switch;

public class Switch {
    public static void main (String[] args){
        String action = "agregar";

        switch (action){
            case "agregar":
                System.out.println("Agregando recurso");
                break;//Hasta aqui se ejecuta el codigo
            case "eliminar":
                System.out.println("Eliminando recurso");
                break;
            default:
                System.out.println("Accion por defecto");

        }
    }
}
