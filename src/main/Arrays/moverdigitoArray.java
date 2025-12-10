package Arrays;

public class moverdigitoArray {
    public static void main(String[] args) {
        int[] array = {2, 8, 7, 5, 9};
        int mover = 2;
        int temp = array[mover];

        for(int i = mover; i < array.length-1; i++){
            array[i] = array[i+1];
        }
        array[array.length -1] = temp;
    }
}
