package Refuerzo;

import java.util.Scanner;

public class ref14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce 2 numeros enteros");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if((a>0) || (b>0)){
            System.out.println("Uno de los numeros es positivo");
        } else if ((a>0) && (b>0)) {
            System.out.println("Los 2 numeros son positivos");
        } else {
            System.out.println("Ninguno es positivo");
        }
    }
}
