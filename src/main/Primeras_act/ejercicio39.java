package Primeras_act;

import java.util.Scanner;

public class ejercicio39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el lado a:");
        int a = sc.nextInt();
        System.out.println("Ingrese el lado b:");
        int b = sc.nextInt();
        System.out.println("Ingrese el lado c:");
        int c = sc.nextInt();

        if(a + b > c && a + c > b && b + c > a) {
            int mayor = Math.max(a, Math.max(b, c));
            if (mayor == c) {
                if ((c * c) < (a * a) + (b * b)) {
                    System.out.println("Es un Acutangulo");
                } else if ((c * c) == ((a * a) + (b * b))) {
                    System.out.println("Es un Rectangulo");
                } else if ((c * c) < (a * a) + (b * b)) {
                    System.out.println("Es un Obtusangulo");
                }
            } else  {
                System.out.println("El mayor no es el lado C");
            }

        } else{
            System.out.println("No es un triangulo");
        }
    }
}
