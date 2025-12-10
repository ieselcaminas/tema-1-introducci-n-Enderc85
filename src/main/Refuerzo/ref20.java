package Refuerzo;

import java.util.Scanner;

public class ref20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float sueldo_men;
        float sueldocongastos;
        float gastos;

        System.out.println("Ingrese sueldo men: ");
        sueldo_men = sc.nextFloat();

        System.out.println("Ingrese los gastos");
        gastos = sc.nextFloat();

        sueldocongastos = (sueldo_men - gastos);

        if(sueldo_men < sueldocongastos) {
            System.out.println("no");
        } else {
            System.out.println("si");
        }
    }
}
