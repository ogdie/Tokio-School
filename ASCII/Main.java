import java.util.Scanner;

public class Main {
    public static void convertOpposite (String texto) {
        int comprimento = texto.length();
        for (int i = 0; i < comprimento; i++) {
            Character c = texto.charAt(i);
            if (Character.isLowerCase(c)) {
                char toUpperCase = (char) (c - 32);
                texto = texto.toUpperCase();
            } else {
                char toLowerCase = (char) (c + 32);
                texto = texto.toLowerCase();
            }
        }
        System.out.println(texto);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite");
        String texto = scan.nextLine();
        convertOpposite(texto);
     }
}