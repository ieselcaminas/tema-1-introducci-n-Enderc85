package Primeras_act;

import java.util.Scanner;

public class ejemplo17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero del mes:");
        int num = sc.nextInt();

        switch (num) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("El mes tiene 31 dias");
                break;
            case 2:
                System.out.println("El mes tiene 28/29 dias");
                break;
            default:
                System.out.println("El mes tiene 30 dias");
                break;
        }
    }
}
