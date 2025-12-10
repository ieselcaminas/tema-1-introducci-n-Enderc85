package Strings;

import java.util.Scanner;

public class string_alfabetica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el texto:");
        String palabra = sc.nextLine();

        System.out.println(palAlfabetica(palabra));

    }

    public static String palAlfabetica(String palabra) {
        int actual;
        int siguiente;
        boolean texto = true;
        for (int i = 0; i < palabra.length() - 1; i++) {
            actual = palabra.charAt(i);
            siguiente = palabra.charAt(i + 1);
            if (actual >siguiente) {
                texto = false;
            }
        }
        if (texto) {
            return "Es alfabetica";
        }
        else  {
            return "No alfabetica";
        }
    }
}



