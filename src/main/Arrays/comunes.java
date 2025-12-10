package Arrays;

public class comunes {
    public static void main(String[] args) {

        int[] array1 = {1,2,3,4,5};
        int[] array2 = {0,2,4,6};
        String resultado="";

        for(int i=0;i<array1.length;i++){
            for(int j=0;j<array2.length;j++){
                if(array1[i]==array2[j]){
                    resultado+=array1[i]+" ";
                }
            }
        }
        System.out.println(resultado);
    }
}
