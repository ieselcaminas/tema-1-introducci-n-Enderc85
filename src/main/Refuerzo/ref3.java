package Refuerzo;

import java.util.Scanner;

public class ref3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el primer numero:");
        int num1 = sc.nextInt();
        System.out.println("Introduce el segundo numero:");
        int num2 = sc.nextInt();

        if(num1%num2==0){
            System.out.println("El numero es multiplo");
        } else {
            System.out.println("El numero no es multiplo");
        }
    }
}
