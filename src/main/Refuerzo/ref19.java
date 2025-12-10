package Refuerzo;

import java.util.Scanner;

public class ref19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce los metros: ");
        float distancia = sc.nextInt();
        System.out.println("Introduce los segundos: ");
        float tiempo = sc.nextInt();
        System.out.println("Introduce la distancia max permitida: ");
        float velocidadmax = sc.nextInt();


        float km = distancia / 1000;
        float horas = tiempo / 3600;
        float velocidadreal = km/horas;

        if (km <= 0 || horas <= 0) {
            System.out.println("ERROR");
        }

        if (velocidadreal <= velocidadmax) {
            System.out.println("OK");
        } else if (velocidadreal <= (velocidadmax*0.2)+velocidadmax) {
            System.out.println("Multa");
        } else {
            System.out.println("Puntos");
        }
    }
}
