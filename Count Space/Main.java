import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String texto;
        int contadorEspaco = 0;

        System.out.println("*** CONTADOR DE ESPACOS ***");
        System.out.print("Digite um texto: ");
        texto = scan.nextLine();
        
        int stop = texto.indexOf('.');
        if (stop >= 0){
            texto = texto.substring(0, stop);
        }
        for (int i = 0; i<texto.length(); i++){
            if (texto.charAt(i) == ' '){
                contadorEspaco++;
            }
        }
        System.out.println("Esse texto contem " + contadorEspaco + " espacos.");
    }
}
