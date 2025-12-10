package Primeras_act;

import java.util.Scanner;

public class ejemplo22 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int positivo = 0;
        int num;

        for(int i=0; i<=10; i++ ){
            num = leer.nextInt();
            if(num >=0){
                positivo++;
            }
        }
        System.out.println("Hay "+positivo+" positivos");
    }
}
