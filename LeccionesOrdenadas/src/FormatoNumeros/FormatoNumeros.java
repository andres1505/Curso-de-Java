package FormatoNumeros;

import java.text.NumberFormat;//me agrega el import automaticamente para poder utilizar la clase NumberFormat
import java.util.Locale;

public class FormatoNumeros {
    public static void main(String[] args){
        //para cambiar la local que se utiliza tenemos que hacer lo siguiente:
        Locale locale = Locale.forLanguageTag("es-CO");//Aca se crea una instancia de la clase de local y se configura la local de Colombia

        //Este me permite obtener un objeto con el cual voy a trabajar con tipos de monedas
        //Cree la variable numberFormat la cual es una instancia de la clase NumberFormat
        NumberFormat numberFormat =NumberFormat.getCurrencyInstance(locale);//Esta clase es abstracta lo que significa que no puedo crear instancias de objetos usando la palabra reservada new
        String result = numberFormat.format(10099.90);
        System.out.println(result);//Me muestra el valor en con formato de moneda

        NumberFormat porcentaje = NumberFormat.getPercentInstance();//Declaramos una variable en base a format
        System.out.println(porcentaje.format(0.15));//me devulve el valor con porcentaje

    }
}
