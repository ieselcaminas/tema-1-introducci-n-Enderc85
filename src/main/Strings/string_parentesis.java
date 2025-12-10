package Strings;

public class string_parentesis {
    public static void main(String[] args) {
        String frase = "hola)(";


        System.out.println(parentheses(frase));

    }
    public static String parentheses(String frase) {
        int contador = 0;
        for (int i = 0 ; i < frase.length(); i++) {
            if (contador < 0) {
                break;
            } else if (frase.charAt(i) == '(') {
                contador++;
            } else if (frase.charAt(i) == ')') {
                contador--;
            }
        }
        if (contador == 0) {
            return "Esta bien parentiza";
        } else {
            return "Esta mal parentizada";
        }
    }
}
