package Strings;

public class longitud2 {
    public static void main(String[] args) {
        String cadena = "Una cadena de texto de";
        String[] array = cadena.split(" ");
        boolean palabra = false;
        int k = 1;

        for(int i = 0; i < array.length; i++){
            if(array[i].length() == k){
                palabra = true;
                break;
            }
        }

        System.out.println(palabra);
    }
}

