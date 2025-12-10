package Refuerzo;

import java.util.Scanner;

public class ref9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese el primer numero:");
        int a = sc.nextInt();

        if((a%2==0)&& !(a%3==0)){
            System.out.println("Es multiplo de 2 y no de 3");
        }

    }
}
