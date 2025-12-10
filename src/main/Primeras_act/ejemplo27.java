package Primeras_act;

public class ejemplo27 {
    public static void main(String[] args) {
        int condicion = 6;
        int i = 1;

        do {
            int j = 1;
            do {
                System.out.print(j + " ");
                j++;
            } while (j <= i);

            if ( i == condicion){
                System.out.print("n");
            }
            System.out.println();
            i++;
        } while (i <= condicion);
    }
}
