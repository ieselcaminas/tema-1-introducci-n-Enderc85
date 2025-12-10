package Metodos;

import java.util.Scanner;

public class metodo3 {
    public static void main(String argv[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la nota");
        int nota = sc.nextInt();

        // Si las condiciones son mutuamente excluyentes, se usa if .. else if ...
        if ((nota < 0) || (nota > 10)) {
            System.out.println("Nota inválida");
        }else if (nota < 3) {
            System.out.println("Muy deficiente");
        }else if (nota < 5 ) {
            // No hace falta que comprobemos que es mayor que 3, porque si lo fuera
            // habría entrado por el if (nota < 3) {
            System.out.println("Insuficiente");
        }else if (nota < 6 ) {
            System.out.println("Suficiente");
        }else if (nota < 7 ) {
            System.out.println("bien");
        }else if (nota < 9 ) {
            System.out.println("Notable");
        }else {
            System.out.println("Sobresaliente");
        }

    }
}
