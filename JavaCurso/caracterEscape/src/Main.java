//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String texto = "C:\\Hola \"Mundo\"";//para escapar un caracter hacemos uso del backslash
        System.out.println(texto);

        String text = "Hola \nMundo"; //todo el texto a la derecha de n lo lleva a una nueva linea
        System.out.println(text);
        System.out.println("Hola \tMundo");// el /t hace una tabulacion a lo que este en la derecha del texto


    }
}