package Arrays;

public class Duplicados {
    public static void main(String[] args) {
        int[] ar1 = {1, 2, 3, 3, 4, 2, 9, 1};
        String resultado = "";

        for(int i = 0; i < ar1.length - 1; i++){
            for(int j = i + 1; j < ar1.length; j++){
                if(ar1[i] == ar1[j]){
                    resultado +=ar1[i] + ", ";
                }
            }
        }
        System.out.printf("Los numeros repetidos en el array son: %s", resultado);
    }
}
