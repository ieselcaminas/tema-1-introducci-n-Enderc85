package Metodos;

import java.util.Scanner;

public class metodo1 {
    public static void main(String argv[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce dos numeros");
        int num = sc.nextInt();
        int num2 = sc.nextInt();

        int numeroMayor = numeroGrande(num, num2);

        System.out.println(numeroMayor);

    }
    public static int numeroGrande (int num, int num2) {
        if (num > num2)
            return num;
        else
            return num2;
    }
}
