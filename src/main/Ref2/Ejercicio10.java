package Ref2;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese los compartimentos: ");
        int compartimento = sc.nextInt();
        System.out.println("Ingrese los litros maximos: ");
        int maxLitros = sc.nextInt();
        System.out.println("Ingrese la diferencia: ");
        int diferencia = sc.nextInt();

        System.out.printf("Los litros necesarios para llenar el acuario son: %d", litros(compartimento, maxLitros, diferencia));
    }
    public static int litros(int compartimentos, int maxLitros, int diferencia){

        int litros = 0;
        if (diferencia != 0) {
            for (int i = 0; i < compartimentos; i++) {
                litros += (maxLitros - (i * diferencia));
            }
        }
        else {
            litros = maxLitros * compartimentos;
        }

        return litros;
    }
}
