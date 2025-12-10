package Primeras_act;

import java.util.Scanner;

public class ejemplo11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese numero 1");
        int num1 = sc.nextInt();
        System.out.println("Ingrese numero 2");
        int num2 = sc.nextInt();

        if (num1 < num2) {
            System.out.println(num1 + ", " + num2);
        } else {
            System.out.println(num2 + ", " + num1);
        }
    }
}
