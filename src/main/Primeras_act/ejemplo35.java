package Primeras_act;

import java.util.Scanner;

public class ejemplo35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        int div;
        System.out.println("Ingrese un numero:");
        num = sc.nextInt();
        System.out.println("Ingrese su divisor:");
        div = sc.nextInt();

        do {
           num -= div;

        } while (num >= div);
        System.out.println("El resto es: "+num);
    }
}