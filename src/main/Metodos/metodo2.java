package Metodos;

import java.util.Scanner;

public class metodo2 {
    public static void main(String argv[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce um numero: ");
        int num = sc.nextInt();

        System.out.println(numPositive(num));

    }
    public static String numPositive(int num) {
        if (num >= 0)
            return "El número es positivo";
        else
            return "El numero es negativo";
    }
}
