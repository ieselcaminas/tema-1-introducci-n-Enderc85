package Ref2;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el dia");
        int dia = sc.nextInt();
        System.out.println("Introduce el mesa");
        int mes = sc.nextInt();
        System.out.println(diasHastaNochevieja(dia, mes));

    }


    public static int diasHastaNochevieja (int dia, int mes){

        int[] meses = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int anio = 365;
        int dias = dia;
        for (int i = 0; i < mes - 1; i++) {
                dias += meses[i];
        }

        return anio - dias;

        /*int nocheVieja = 365;

        if(mes == 1){
            mes = 31;
        } else if(mes == 2){
            mes = 59;
        } else if(mes == 3){
            mes = 31;
        } else if(mes == 4){
            mes = 70;
        } else if(mes == 5){
            mes = 120;
        } else if(mes == 6){
            mes = 151;
        } else if(mes == 7){
           mes = 211;
        } else if(mes == 8){
            mes = 242;
        } else if(mes == 9){
            mes = 272;
        }  else if(mes == 10){
            mes = 303;
        } else if(mes == 11){
            mes = 333;
        } else if(mes == 12){
            mes = 364;
        }
        int diasMes;
        if(mes == 1 || mes== 3|| mes ==5 || mes ==7 || mes ==8 || mes ==10 || mes ==12){
            diasMes = 31;
        }else if(mes == 2){
            diasMes = 28;
        } else {
            diasMes = 30;
        }

        int num = (diasMes - dia) -mes;
        */
    }
}
