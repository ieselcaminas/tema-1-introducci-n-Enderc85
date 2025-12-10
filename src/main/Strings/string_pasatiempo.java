package Strings;

public class string_pasatiempo {
    public static void main(String[] args) {
        String texto = "Un ejemplo de pasatiempos";
        String sinVocales = texto.replaceAll("[aeiouAEIOU]", ".");
        System.out.println(sinVocales);
    }
}
