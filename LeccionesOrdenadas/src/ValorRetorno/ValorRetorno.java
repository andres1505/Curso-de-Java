package ValorRetorno;

public class ValorRetorno {
    public static void main(String[] args){
        int resultado = suma(12, 25);//Tenemos que capturar este valor en una variable
        System.out.println(resultado);
    }

    //En el metodo especificamos el tipo de dato que a retornar este en este caso es int si no devuelve nada es void
    static int suma(int a, int b){
        return a + b; //Return se va a encargar de devolver los valores que nostros le especificamos
    }
}
