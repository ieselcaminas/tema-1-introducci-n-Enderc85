package Refuerzo;

import java.util.Scanner;

public class ref12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese 2 numeros:");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if((a%2==0) || (b%2==0)){
            System.out.println("Uno de los numeros es par");
        }
    }
}
