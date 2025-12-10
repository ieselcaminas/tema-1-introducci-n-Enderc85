package Primeras_act;

import java.util.Scanner;

public class ejemplo24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nota;
        int media = 0;
        int contador = 0;
        boolean Hayun10 = false;
        System.out.println("Ingrese sus notas y finaliza con -1: ");

        do {
            nota = sc.nextInt();
            contador++;
            media = media + nota;

            if(nota == 10){
                Hayun10 = true;
            }

        } while (nota != -1);

        /*Seria mejor no usar otra variable para realizar el calculo
        y hacer la division en el sout
        */
        System.out.println("La nota es: "+ media/contador);

        if(Hayun10 = true){
            System.out.println("Hay un 10 en la nota");
        }
    }
}
