package Refuerzo;

import java.util.Scanner;

public class ref13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese 2 numeros:");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if((a%2==0) && (b%2==0)){
            System.out.println("Los numeros son pares");
        } else if (a%2==0) {
            System.out.println("El primero es par");
        } else if (b%2==0) {
            System.out.println("El segundo es par");
        }
    }
}