package Ref2;

import java.util.Arrays;

public class Ejercicio8 {
   public static void main(String[] args) {

        int[] num = {4, 5, 7, 8, 9};
        Arrays.toString(num);
        System.out.println(cualFalta(num));
    }
    public static int cualFalta (int[] num) {

        Arrays.sort(num);

        for (int i = 0; i < num.length; i++) {
            if (num[i] +1 != num[i + 1]) {
                return num[i] + 1;
            }

        }
        return -1;
    }
}
