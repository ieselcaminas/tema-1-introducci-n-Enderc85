package Primeras_act;

import java.util.Scanner;

public class ejemplo21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el año:");
        int year = sc.nextInt();

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Año bisiesto");
        } else {
            System.out.println("Año no bisiesto");
        }
    }
}
