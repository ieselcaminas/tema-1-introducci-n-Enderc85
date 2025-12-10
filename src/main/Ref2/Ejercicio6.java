package Ref2;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca una cadena de numeros: ");
        int num = sc.nextInt();

        if (esHyperpar(num)){
            System.out.printf("Toda la cadena %d es par", num);
        } else {
            System.out.printf("Hay un digito de la cadena %d que no es par", num);
        }

    }
    public static boolean esHyperpar(int num){
        boolean cadenaPar = true;
        int dig = 0;
        while (num > 0) {
            dig = num % 10;
            if (dig % 2 != 0) {
                cadenaPar = false;
                break;
            }
            num = num / 10;
        }
        return cadenaPar;
    }
}
