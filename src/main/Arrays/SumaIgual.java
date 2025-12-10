package Arrays;

public class SumaIgual {
    public static void main(String[] args) {
        int[] num = {3, 4, 6, 9, 5, 8};
        int sumIguales = 9;

        for(int i = 0; i < num.length -i ; i++){
            for(int j = 0; j < num.length ; j++){
                if(num[i]+num[j] == sumIguales){
                    //System.out.println(num[i]+ " + " + num[j] +" = " + sumIguales);
                    System.out.printf("%d + %d = %d\n", num[i], num[j], sumIguales);
                }
            }
        }
    }
}
