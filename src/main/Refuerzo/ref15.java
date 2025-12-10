package Refuerzo;

import java.util.Scanner;

public class ref15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce los segundos");
        int tiempo = sc.nextInt();

        int horas = tiempo/3600;
        int minutos = (tiempo%3600)/60;
        int segundos = tiempo%60;
        System.out.println("La hora es "+ horas + " : " + minutos + " : " + segundos);
    }
}
