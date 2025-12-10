package Strings;

public class longitud3 {
    public static void main(String[] args) {
        String cadena = "Una cadena de texto de";
        String[] array = cadena.split(" ");
        boolean palabra = true;
        int k = 7;

        for(int i = 0; i < array.length; i++){
            if(array[i].length() >= k){
                palabra = false;
                break;
            }
        }

        if(palabra){
            System.out.println("Todas las cadenas son cortas");
        } else  {
            System.out.println("Hay alguna palabra larga");
        }
    }
}


