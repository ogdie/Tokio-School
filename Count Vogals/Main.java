public class Main {
    private static int vogais (String texto){
        int contarVogais = 0;

        for (int i = 0; i < texto.length(); i++){
            char c = texto.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                contarVogais++;
        }
        return contarVogais;
    }
    public static void main(String[] args) {
        String texto = "AeIoU";
        String texto2 = "A abelha e feroz";
        String texto3 = "A abelha é feroz?";

        System.out.println(texto + " contem " + vogais(texto.toLowerCase()) + " vogais.");
        System.out.println(texto2 + " contem " + vogais(texto2.toLowerCase()) + " vogais.");
        System.out.println(texto3 + " contem " + vogais(texto3.toLowerCase()) + " vogais.");
    }
}