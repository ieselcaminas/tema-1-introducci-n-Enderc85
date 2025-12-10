package Primeras_act;

import java.util.Scanner;

public class ejemplo31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        String cal = "";

        System.out.println("Ingrese el numero de la operacion:");
        num = sc.nextInt();

        // El 27 se puede hacer de esta forma tambien
        // Y este se puede hacer sin el string
       for(int i=1;i<num;i++){
           if(num%i==0){
               cal += i + " ";
           }
       }
        System.out.println(cal);

    }
}
