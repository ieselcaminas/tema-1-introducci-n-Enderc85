package Arrays;

public class arrayMin {
    public static void main(String[] args) {

        int[] numeros = new int[] {1, 2, 3, 4, 5};

        System.out.println(minimo(numeros));

    }
    public static int minimo(int[] numeros){
        int min = 0;
        for (int i = 0; i < numeros.length; i++){
            if (numeros[i] < min){
                min = numeros[i];
            }
        }
        return min;
    }
}
