import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] [] numeros = { {0,1}, {2,3}};
        System.out.println(Arrays.deepToString(numeros));//este metodo nos muestra un array que contiene otro array dentro

        int[] [] numbers = new int[3][2];//Tres columnas x dos filas
        numbers[0][0] = 5;
        System.out.println(Arrays.deepToString(numbers));

        int[] [] [] numbers2 = new int[3][2][2];//Tres dimensiones
        numbers2 [0][0][0] = 5;
        System.out.println(Arrays.deepToString(numbers2));
    }
}