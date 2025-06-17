//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String text = "Hola Mundo"; // cuando no usamos new string este se llama string literal y este cuenta con varios metodos

        int largo = text.length();//devuelve el tamaño del string contando los espacios en este caso es 10
        System.out.println(largo);

        //los argumentos son los valores que nosotros le pasamos en este caso "Hola"
        String texto = text.replace("Hola","Chao");//este metodo remplaza las coincidencias encontradas con lo que le pasamos
        System.out.println(text);

        //los strings son inmutables lo que quiere decir que cualquier metodo que nosotros usemos de un string, este lo que va a hacer es crear un nuevo string para nosotros poder asignarlo a una nueva variable

        System.out.println(texto.endsWith("undo"));//este metodo me devuelve true o false dependiendo con lo que termina mi string

        System.out.println(texto.startsWith("ch"));//este metodo me devuelve true o false dependiendo con lo que inicia mi string

        System.out.println(texto.contains("und"));//este metodo nos sirve para saber si contiene o no contiene una cadena de texto en especifico
        System.out.println(texto.indexOf("Mund"));//me devuelve el indice de donde se encuentra la cadena de texto

        System.out.println(texto.toUpperCase()); //pasa todo el texto a mayuscula
        System.out.println(texto.toLowerCase());//pasa todo a minuscula

        String malo = "        chanchito feliz    ";
        System.out.println(malo.trim()); // este metodo elimina los espacios del comienzo y del final
        System.out.println(malo);



    }
}