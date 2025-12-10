package Primeras_act;

import java.util.Scanner;

public class ejemplo18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la hora");
        int hora = sc.nextInt();

        System.out.println("Ingrese los minutos");
        int minutos = sc.nextInt();

        System.out.println("Ingrese los segundos");
        int segundos = sc.nextInt();

        segundos++;

        if (segundos == 60) {
            segundos = 0;
            minutos++;

            if (minutos == 60) {
            minutos = 0;
            hora++;

            if (hora == 24) {
            hora = 0;

                }
            }
        }
        //formato de horas
        System.out.printf("%02d:%02d:%02d\n", hora, minutos, segundos);
        //System.out.println(hora + ":" + minutos + ":" + segundos);
    }
}
