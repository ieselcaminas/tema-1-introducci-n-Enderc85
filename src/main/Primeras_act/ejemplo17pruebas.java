package Primeras_act;

import java.util.Scanner;

public class ejemplo17pruebas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero del mes:");
        int mes = sc.nextInt();

        if ((mes == 1) || (mes == 3) || (mes == 5) || (mes == 7) || (mes == 8) ||  (mes == 10) || (mes == 12)) {
            System.out.println("El mes tiene 31 dias");
        } else if (mes == 2) {
            System.out.println("El mes tiene 28/29 dias");
        } else {
            System.out.println("El mes tiene 30 dias");
        }
    }
}
