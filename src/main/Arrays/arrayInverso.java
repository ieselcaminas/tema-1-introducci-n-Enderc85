package Arrays;

import java.util.Arrays;

public class arrayInverso {
    public static void main(String[] args) {

        int[] ar1 = {1, 2, 3, 3, 4, 2, 9, 1};
        int[] ar2 = new int[ar1.length];

        for (int i = ar1.length - 1; i >= 0; i--) {
            ar2[ar1.length -1 -i] = ar1[i];
        }
        System.out.println(Arrays.toString(ar2));
    }
}
