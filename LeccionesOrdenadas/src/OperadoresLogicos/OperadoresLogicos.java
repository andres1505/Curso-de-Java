package OperadoresLogicos;

public class OperadoresLogicos {
    public static void main (String[] args){
        boolean a = true;
        boolean b = false;

        //Operador logico OR
        /*
        El operador logico OR evalua dos condiciones,
        si una de las dos condiciones es verdadera retorna true
        Retorna false si ambas condiciones son falsas
         */
        boolean c = b || a;//se puede ejecutar con mas de dos variables
        System.out.println(c);

        //Operador logico AND
        boolean d = a && b;
        /*
        El operador logico AND se utiliza para verificar si dos o mas condiciones son verdaderas al mismo tiempo.
        Retorna True si ambas condiciones son verdaderas
        Retorna False si al menos una es falsa
         */
        System.out.println(d);

        //Operador logico de NOT
        boolean x = !a;
        /*
            El operador NOT invierte el valor de la variable si es False lo convierte a True o viceversa la notacion es muy diferente se utiliza el "!" a la izquierda de la variable;
         */

        System.out.println(x);

        boolean isAdult = true;
        boolean isActive = false;
        boolean isPremium = true;
        boolean isOn = true;
        boolean hasFunds = true;

        String coupon = "Chanchito-feliz";

        boolean promo = coupon.equals("ultimate_java") || coupon.equals("Chanchito-feliz");

        boolean canPurchase = isAdult && isActive && hasFunds;

        System.out.println(promo);
        System.out.println(canPurchase);



    }
}
