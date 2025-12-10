package Refuerzo;

import java.util.Scanner;

public class ref4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el primer numero:");
        int num = sc.nextInt();

        if (num % 10 == 0) {
            System.out.println("El primer numero es multiplo de 10");
            System.out.println("Ingrese el segundo numero");
            int num2 = sc.nextInt();

            if (num2 % 10 == 0) {
                System.out.println("El segundo numero es multiplo de 10");
            } else  {
                System.out.println("El segundo numero no es multiplo de 10");
            }

        }else {
            System.out.println("El primer numero no es multiplo de 10");
        }
    }
}
