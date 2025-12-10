package Primeras_act;

import java.util.Scanner;
public class ejemplo6 {
    public static void main (String argv[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius");
        int radius = sc.nextInt();
        float PI = 3.14159f;
        float perimetro = 2*PI*radius;
        float area = (PI*radius*radius);
        System.out.println("length= "+ perimetro);
        System.out.println("area= "+area);

        sc.close();
        //Aquí usamos los datos obtenidos
    }
}