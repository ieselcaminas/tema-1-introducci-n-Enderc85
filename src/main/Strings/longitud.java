package Strings;

public class longitud {
    public static void main(String[] args) {
        String cadena = "Una cadena de texto de";
        String[] array = cadena.split(" ");
        int contador = 0;
        int k = 2;

        for(int i = 0; i < array.length; i++){
            if(array[i].length() == k){
                contador++;
            }
        }

        System.out.println(contador);
    }
}
