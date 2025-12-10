package Strings;

import java.util.Scanner;

public class string_dig2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el texto: ");
        String texto = sc.nextLine();

        System.out.println("Hay " + conDigi(texto) + " digitos");
    }
    public static int conDigi(String texto) {
        int contador = 0;
        for (int i=0; i<texto.length(); i++) {
            if (Character.isDigit(texto.charAt(i))) {
                contador++;
            }
        }
        return contador;
    }
}
