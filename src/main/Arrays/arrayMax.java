package Arrays;

public class arrayMax {
    public static void main(String[] args) {

        int[] numeros = new int[] {1, 2, 3, 4, 5};

        System.out.println(maxima(numeros));

    }
    public static int maxima(int[] numeros){
        int maxima = 0;
        for (int i = 0; i < numeros.length; i++){
            if (numeros[i] > maxima){
                maxima = numeros[i];
            }
        }
        return maxima;
    }
}
