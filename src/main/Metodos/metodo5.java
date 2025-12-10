package Metodos;

import java.util.Scanner;

public class metodo5 {
    public static void main (String argv[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1:");
        int x = sc.nextInt();
        System.out.println("Enter number 2:");
        int y = sc.nextInt();

        int sum = suma(x, y);
        int sub = resta(x, y);
        int mult = mult(x, y);
        int div = div(x, y);

        System.out.println("sum = " + sum);
        System.out.println("sub = " + sub);
        System.out.println("mult = " + mult);
        System.out.println("div = " + div);
        sc.close();
        //Aquí usamos los datos obtenidos
    }

    public static int suma(int x, int y) {
        return x + y;

    }
    public static int resta(int x, int y) {
        return x - y;

    }
    public static int mult(int x, int y) {
        return x * y;

    }
    public static int div(int x, int y) {
        return x / y;
    }
}
