package Refuerzo;

import java.util.Scanner;

public class ref7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese el primer numero:");
        int a = sc.nextInt();

        if(a%2==0){
            System.out.println("Es multiplo de 2");
        } else if(a%3==0){
            System.out.println("Es multiplo de 3");
        }
    }
}
