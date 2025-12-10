package Refuerzo;

import java.util.Scanner;

public class ref2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("ingrese un numero:");
        int num = input.nextInt();

        if (num%2==0)
        {
            System.out.println("El numero es par");
        } else {
            System.out.println("El numero es impar");
        }
    }
}
