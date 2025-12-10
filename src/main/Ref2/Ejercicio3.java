package Ref2;

public class Ejercicio3 {
    public static void main(String[] args) {

    String digitos = "1239";

        System.out.println(sumaDigitos(digitos));

    }
    public static String sumaDigitos(String digitos){

    int suma = 0;
    String calc = "";

    for(int i = 0; i < digitos.length(); i++){
        suma += Integer.parseInt("" + digitos.charAt(i));
        calc += digitos.charAt(i) ;
        if (i == digitos.length() -1) {
           calc += " = ";
        } else {
            calc += "+ ";
        }
    }
    return calc + suma;
    /*


    for(int i = 1; i < digitos.length(); i++){
        calc = calc + " + "+digitos.charAt(i);
    }


        return  calc += " = " + suma ;
    */}
}
