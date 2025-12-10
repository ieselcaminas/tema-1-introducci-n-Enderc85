package Primeras_act;

import java.util.Scanner;

public class ejemplo34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        int mult;
        int num2 = 0;
        System.out.println("Ingrese un numero:");
        num = sc.nextInt();
        System.out.println("Ingrese su multiplicacion:");
        mult = sc.nextInt();

        for(int i=1;i<=mult;i++){
           num2 = num2 + num;
        }
        System.out.println(num +" x " + mult + " = "+num2);
    }
}
