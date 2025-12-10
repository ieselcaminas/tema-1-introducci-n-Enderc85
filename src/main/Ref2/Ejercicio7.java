package Ref2;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el canal actual: ");
    int desde = sc.nextInt();
        System.out.println("Introduce el canal al que quieres avanzar: ");
    int hasta = sc.nextInt();

        System.out.println(canales(desde, hasta));


    }
    public static int canales(int desde, int hasta){
    int canales = 99;

    int min = Math.min(desde, hasta);
    int max = Math.max(desde, hasta);

    int avanzar = (canales - max) + min;
    int retroceder = max - min;

    // int avanzar = (hasta - desde + canales) %canales;
    // int retroceder = (desde - hasta + canales) %canales;

    if (avanzar > retroceder){
        return retroceder;
    } else {
        return avanzar;

    }
    }
}

