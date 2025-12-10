package Arrays;

import java.util.Scanner;

public class arrayMarco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] cadenas = new String[5];

        System.out.println("Introduce 5 cadenas de texto:");
        for (int i = 0; i < cadenas.length; i++) {
            cadenas[i] = sc.nextLine();
        }
    
     
        System.out.println(textoMarco(cadenas));
        

    }
    public static String textoMarco(String[] cadenas) {
        
        int maximo= 0;
        String asteriscos = "";

        for (int i = 0; i < cadenas.length; i++){
            if(cadenas[i].length()>maximo){
                maximo = cadenas[i].length();
            }
        }

            //linea superior con asteriscos
        
            for (int j = 0; j < maximo+4; j++){
                asteriscos += "*";
            }

            //laterales con asteriscos

            for (int l = 0; l < cadenas.length; l++){
                asteriscos += "\n* " + cadenas[l];
                for (int r = 0; r < maximo - cadenas[l].length(); r++){
                asteriscos += " ";
                }
                asteriscos += " *";
            }

            //linea inferior con asteriscos
            asteriscos += "\n";
            for (int j = 0; j < maximo+4; j++){
                asteriscos += "*";

        }
        return asteriscos;

    }
}
