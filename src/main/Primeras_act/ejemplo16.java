package Primeras_act;

import java.util.Scanner;

public class ejemplo16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        int num = sc.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int num2 = sc.nextInt();
        System.out.println("Ingrese la operacion (+, -, /, *): ");
        String op = sc.next();
        switch (op) {
            case "+":
                System.out.println(num + num2);
                break;
            case "-":
                System.out.println(num - num2);
                break;
            case "*":
                System.out.println(num * num2);
                break;
            case "/":
                System.out.println(num / num2);
                break;
        }
    }
}
