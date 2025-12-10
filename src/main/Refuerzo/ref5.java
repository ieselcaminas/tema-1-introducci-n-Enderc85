package Refuerzo;

import java.util.Scanner;

public class ref5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ingrese el primer numero:");
        int a = sc.nextInt();

        if (a==0) {
            System.out.println("El producto de 0 por cualquier numero es 0");
        } else {
            System.out.println("ingrese el segundo numero:");
        int b = sc.nextInt();
            System.out.println(a*b);
        }
    }
}
