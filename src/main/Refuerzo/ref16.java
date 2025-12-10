package Refuerzo;

import java.util.Scanner;

public class ref16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese 3 numeros:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        int mayor = Math.max(num1, Math.max(num2, num3));
            if (mayor == num1) {
                System.out.println("El mayor es " + mayor);
            } else if (mayor == num2) {
                System.out.println("El mayor es " + mayor);
            } else if (mayor == num3) {
                System.out.println("El mayor es " + mayor);
            } else if (mayor == num1 && mayor == num2 && mayor == num3) {
                System.out.println("Todos los numeros son iguales");
            }
    }
}
