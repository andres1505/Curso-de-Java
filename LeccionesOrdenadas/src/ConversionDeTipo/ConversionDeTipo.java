package ConversionDeTipo;

public class ConversionDeTipo {
    public static void main(String[] args){
        //Conversion implicita
        byte a = 1;
        int b = 15; // son de tipo diferente pero queremos sumarlos

        int c = a + b;//lo que hace java es que toma el dato que tiene menos bytes y lo toma al tipo de dato que tiene mas bytes
        System.out.println(c);

        byte x = 1;
        double y = 15.15;

        double z = x + y;
        System.out.println(z);

        //Conversion explicita
        int p = 15;
        double o = 15.15; //los nombres de las variables deben ser representativos
        int i = (int)(p + o);//para convertir el valor se pone la expresion en parentesis y el tipo de dato al que queremos convertir tambien
        i = p + (int) o; //aca solo se convierte el valor de "o" el cual queremos convertir
        System.out.println(i);

        String j = "1.1";
        int k = 5;
        double l = Double.parseDouble(j) + k;//El parse se utiliza para tranformar Strings a otros tipos de datos; el unico que cambia el int que seria en su caso Integer.parseInt
        System.out.println(l);

    }
}
