package Primeras_act;

import java.util.Scanner;
public class ejemplo5 {
    public static void main (String argv[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1:");
        int x = sc.nextInt();
        System.out.println("Enter number 2:");
        int y = sc.nextInt();

        int sum = x + y;
        int sub = x - y;
        int mult = x * y;
        int div = x / y;
        System.out.println("sum = " + sum);
        System.out.println("sub = " + sub);
        System.out.println("mult = " + mult);
        System.out.println("div = " + div);
        sc.close();
        //Aquí usamos los datos obtenidos
    }
}