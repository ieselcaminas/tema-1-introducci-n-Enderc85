package Primeras_act;

import java.util.Scanner;

public class ejemplo20 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el precio:");
        float precio = leer.nextFloat();
        float descuento = 0;

        if (precio < 6) {
            descuento = 0;
        }else if (precio <60) {
            descuento = 0.05f;
        }else{
            descuento =0.1f;
        }

        float total = precio -(precio*descuento);

        System.out.println("El precio final es: "+precio);

    }
}
