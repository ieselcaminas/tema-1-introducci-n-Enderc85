package Strings;

import java.util.Scanner;

public class string_siglas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el texto: ");
        String texto = sc.nextLine();
        String siglas = "";


        System.out.println(conSiglas(texto));
    }
    public static String conSiglas(String texto){
        String siglas = "";
        for (int i=0; i<texto.length(); i++) {
            if (Character.isUpperCase(texto.charAt(i))) {
                siglas += texto.charAt(i);
            }
        }
        return siglas;
    }
}
