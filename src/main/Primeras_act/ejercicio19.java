package Primeras_act;

import java.util.Scanner;

public class ejercicio19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el numero de horas:");
        int horas = sc.nextInt();
        System.out.println("Ingrese el precio por hora:");
        float precio = sc.nextFloat();
        float salario_bruto;
        float impuesto;

        if (horas <= 35) {
            salario_bruto = horas * precio;
        } else {
            salario_bruto = precio * 35 + (horas - 35) * (precio * 1.5f);
        }

        if (salario_bruto <= 500) {
            impuesto = 0;
        } else if (salario_bruto<= 900) {
            impuesto = ((salario_bruto - 500) * 0.25f);
        } else {
            impuesto = (400 * 0.25f) + ((salario_bruto - 900) * 0.45f);
        }

        float salario_neto = salario_bruto - impuesto;

        System.out.println("El salario bruto es:" + salario_bruto + " $");
        System.out.println("Los impuestos son:" + impuesto + " $");
        System.out.println("El salario neto es:" + salario_neto + " $");
    }
}
