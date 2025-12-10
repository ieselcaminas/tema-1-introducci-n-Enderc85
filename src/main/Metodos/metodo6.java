package Metodos;

import java.util.Scanner;

public class metodo6 {
    public static void main (String argv[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el radio");
        int radius = sc.nextInt();

        System.out.println("length= "+ perimetro(radius));
        System.out.println("area= "+area(radius));

        sc.close();

    }
    public static float area(int radius) {
        return (float)(Math.PI * radius * radius);
    }
    public static float perimetro(int radius) {
        return (float)(2 * Math.PI * radius);
    }
}
