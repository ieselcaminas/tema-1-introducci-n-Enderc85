package Primeras_act;

import java.util.Scanner;

public class ejemplo25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el factorial:");
        int num = sc.nextInt();
        int sum = 1;
        for (int i = 1; i < num; i++) {
            sum = sum * i;
        }
        System.out.println("El resultado es: " + sum);
    }
}
