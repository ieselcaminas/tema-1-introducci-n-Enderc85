package Metodos;

import java.util.Scanner;

public class metodo4 {
    public static void main (String argv[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el lado:");
        int lado = sc.nextInt();

        System.out.println(area(lado));


    }
    public static int area(int lado) {
        return lado * lado;
    }
}
