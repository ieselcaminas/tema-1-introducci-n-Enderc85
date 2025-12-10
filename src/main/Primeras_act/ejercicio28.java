package Primeras_act;

import java.util.Scanner;

public class ejercicio28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un numero: ");
        int num = sc.nextInt();

        boolean esPrimo = true;

        if (num <= 1) {
            esPrimo = false;
        } else if (num == 2) {
            esPrimo = true;
        } else if (num % 2 == 0) {
            esPrimo = false;
        } else {
            for (int i = 3; i <= num / 2; i += 2) {
                if (num % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
        }

        if (esPrimo) {
            System.out.println(num + " es primo.");
        } else {
            System.out.println(num + " no es primo.");
        }

        sc.close();
    }
}