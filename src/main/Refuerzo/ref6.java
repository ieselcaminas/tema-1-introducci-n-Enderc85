package Refuerzo;

import java.util.Scanner;

public class ref6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese 2 numeros:");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (b!=0){
            System.out.println(a/b);
        } else  {
            System.out.println("Error: no se puede dividir entre 0");
        }
    }
}
