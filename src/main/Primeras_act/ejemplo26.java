package Primeras_act;

import java.util.Scanner;

public class ejemplo26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Introduce el numero: ");
        num = sc.nextInt();
        for(int i=1;i<=10;i++){

            System.out.println("Tabla de multiplicar del " + num + " : " + num + " x " + i + " = " + num*i);
        }
    }
}
