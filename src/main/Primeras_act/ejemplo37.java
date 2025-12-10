package Primeras_act;

import java.util.Scanner;

public class ejemplo37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el numero binario: ");
        int binario = sc.nextInt();

        System.out.println(binDecimal(binario));

    }
    public static int binDecimal (int binario){
        int potencia = 1;
        int decimal = 0;
        int resto;

        do {
            resto = binario % 10;
            if (resto !=0 && resto !=1) {
                return 0;
            }
            decimal += resto * potencia;
            potencia *= 2;
            binario /= 10;
        }while (binario > 0);
        return decimal;
    }
}
