package Strings;

public class string_palindromo {
    public static void main(String[] args) {
        String texto = "girafarig";

        System.out.println(conPalindromo(texto));
    }
    public static String conPalindromo(String texto) {
        boolean palindromo= true;
        for (int i = 0; i < texto.length(); i++) {
            char a = texto.charAt(i);
            char b = texto.charAt(texto.length() - 1 - i);
            if (a != b) {
                palindromo = false;
                break;
            }

        }

        if (palindromo) {
            return "Es palindromo";
        } else {
            return "No es palindromo";
        }
    }
}
