package Arrays;

public class ArraySuma {
    public static void main(String[] args) {
        int[] numeros = new int[] {1, 2, 3, 4, 5, -1, -2, -3, -4, -5};

        System.out.println("Esta es la suma de negativos "+ sumNegativos(numeros));
        System.out.println("Esta es la suma de negativos "+ sumPositivos(numeros));

    }
    public static int sumPositivos(int[] numeros){
        int sumPos = 0;
        for (int i = 0; i < numeros.length; i++)
            if (numeros[i] > 0){
                sumPos += numeros[i];
            }
        return sumPos;
    }
    public static int sumNegativos(int[] numeros){
        int sumNeg = 0;
        for (int i = 0; i < numeros.length; i++)
            if (numeros[i] < 0){
                sumNeg += numeros[i];
            }
        return sumNeg;
    }
}
