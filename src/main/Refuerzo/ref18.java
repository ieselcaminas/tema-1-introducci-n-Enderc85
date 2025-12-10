package Refuerzo;

import java.util.Scanner;

public class ref18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el numero: ");
        int num = sc.nextInt();

        if (num %2 == 0){
            for (int i = 0; i <= 5; i++){
                num += 2;
                System.out.println(num);
            }
        } else  {
            num += 1;
            for (int i = 0; i <= 5; i++){
                num += 2;
                System.out.println(num);
            }
        }
    }
}
