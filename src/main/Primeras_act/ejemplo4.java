package Primeras_act;

import java.util.Scanner;
public class ejemplo4 {
    public static void main (String argv[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el lado:");
        int lado = sc.nextInt();
        int area = lado * lado;

        sc.close();
        //Aquí usamos los datos obtenidos
        System.out.println("squareArea");
        System.out.println(lado*lado);
    }
}
