package Refuerzo;

import java.util.Scanner;

public class ref21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double papel = 0.00001f;
        double edificio;
        int dobleces=0;
        System.out.println("Introuce la altura del edificio");
        edificio = sc.nextDouble();

        do{
            papel *=2;
            dobleces++;
        } while (papel < edificio);
        System.out.println("Necesitamos " +dobleces+" dobleces para sobrepasar el edificio");

    }
}
