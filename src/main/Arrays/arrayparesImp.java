package Arrays;

public class arrayparesImp {
    public static void main(String[] args) {
        int[] numeros = new int[] {1, 2, 3, 4, 5};

        System.out.println(numPares(numeros));
        System.out.println(numImpares(numeros));
    }
    public static int numPares(int[] numeros) {
        int pares = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                pares++;
            }
        }
        return pares;
    }
    public static int numImpares(int[] numeros) {
        int impares = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 != 0) {
                impares++;
            }
        }
        return impares;
    }

}
