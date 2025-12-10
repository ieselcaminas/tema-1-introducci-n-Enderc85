package Arrays;

public class arraymedia {
    public static void main(String[] args) {

        int[] Notas = new int[4];
        Notas[0] = 1;
        Notas[1] = 2;
        Notas[2] = 3;
        Notas[3] = 4;

        System.out.println(calcMedia(Notas));

    }
    public static int calcMedia(int[] Notas) {
        int sumNota = 0;

        for (int i = 0; i < Notas.length; i++) {
            sumNota += Notas[i];
        }
        int media = sumNota / Notas.length;
        return media;
    }
}
