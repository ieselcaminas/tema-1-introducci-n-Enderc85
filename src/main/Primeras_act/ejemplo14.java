package Primeras_act;

import java.util.Scanner;

public class ejemplo14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe tu nota:");
        int nota = sc.nextInt();
        if (nota <= 3) {
            System.out.println("Muy deficiente");
        } else if (nota < 5) {
            System.out.println("Insuficiente");
        } else if (nota < 6) {
            System.out.println("Suficiente");
        } else if (nota < 7) {
            System.out.println("Bien");
        } else if (nota < 9) {
            System.out.println("Notable");
        } else if (nota <= 10) {
            System.out.println("Excelente");
        } else {
            System.out.println("Nota incorrecta");
        }
    }
}
