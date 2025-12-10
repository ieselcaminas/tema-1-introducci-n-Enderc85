package Primeras_act;

import java.util.Scanner;

public class ejemplo23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int positivo = 0;
        int num;

        System.out.println("Ingrese numeros y para cerrar utilice el 0:");

        do {
            num = sc.nextInt();
            if(num >=0){
                positivo++;
            }
        }while (num != 0);

        System.out.println("Hay "+positivo+" positivos");

    }
}