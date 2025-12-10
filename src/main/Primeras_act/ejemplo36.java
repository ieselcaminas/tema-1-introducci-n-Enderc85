package Primeras_act;

import java.util.Scanner;

public class ejemplo36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el numero decimal: ");
        int decimal = sc.nextInt();



        System.out.println(decBinario(decimal));

    }
    public static String decBinario(int decimal){
        String binario = "";

        if (decimal >= 256) {
            System.out.println("ERROR");
        }

        while (decimal != 0) {
            int resto = decimal % 2;
            binario = resto + binario;
            decimal = decimal / 2;
        }
        return binario;
    }

}
