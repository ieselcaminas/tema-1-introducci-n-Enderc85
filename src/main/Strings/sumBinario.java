package Strings;

public class sumBinario {
    public static void main(String[] args) {
        String numero ="1011";
        String numero2="0101";

        String resultado="";
        String bit ="";
        int acarreo = 0;

        for(int i=numero.length()-1;i>=0;i--){
        int bit1 = Integer.parseInt(""+numero.charAt(i));
        int bit2 = Integer.parseInt(""+numero2.charAt(i));

        int suma = acarreo+bit1+bit2;

        if(suma == 0){
            bit="0";
            acarreo = 0;
        } else if (suma == 1) {
            bit="1";
            acarreo = 0;
        } else if (suma == 2) {
            bit="0";
            acarreo = 1;
        } else{
            bit="1";
            acarreo = 1;
        }
            resultado = bit + resultado;


        }
        if (acarreo == 1){
            resultado = "1" + resultado;
        }


        System.out.println(resultado);
    }
}
