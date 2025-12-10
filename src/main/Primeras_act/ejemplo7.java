package Primeras_act;

import java.util.Scanner;
public class ejemplo7 {
    public static void main (String argv[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el precio real:");
        float precio = sc.nextFloat();
        System.out.println("Introduce el precio rebajado:");
        float precioreal2 = sc.nextFloat();
        float descuento = (precio - precioreal2)/precio *100;
        System.out.println("El precio es: " + descuento);
    }
}