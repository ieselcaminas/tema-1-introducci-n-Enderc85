package Refuerzo;

import java.util.Scanner;

public class ref17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce 2 numeros:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int mayor;
        if (num1 == num2){
            System.out.println("Son iguales");
        } else {
            mayor = Math.max(num1,num2);
            System.out.println(mayor);
        }
    }
}
