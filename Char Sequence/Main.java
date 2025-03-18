import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ArrayCharSequenceTokio sequencia = new ArrayCharSequenceTokio(new char[] {'i','n','v','e','r','t','i','d','a'});
        BackwardsStringSequenceTokio sequenciaInv = new BackwardsStringSequenceTokio("invertida");

        System.out.println("Secuencia original: " + sequencia);
        System.out.println("Sequencia invertida: " + sequenciaInv);

        System.out.print("\nEscolha uma posição da sequencia entre 0 e " + (sequencia.length()-1) +  ": ");
        int c1 = scan.nextInt();
        System.out.println("Caracter obtido: " + sequencia.charAt(c1));
        System.out.print("\nEscolha uma posição da sequencia invertida entre 0 e " + (sequenciaInv.length()-1) +  ": ");
        int c2 = scan.nextInt();
        System.out.println("Caracter obtido: " + sequenciaInv.charAt(c2));

        System.out.println("\nEscolha agora posições de inicio e fim para fazer uma subcadeia invertida.");
        System.out.print("Inicio: ");
        int start2 = scan.nextInt();
        System.out.print("Fim: ");
        int end2 = scan.nextInt();

        BackwardsStringSequenceTokio subCadeiaInv = (BackwardsStringSequenceTokio) sequenciaInv.subSequence(start2, end2);
        if (subCadeiaInv == null)
            System.out.println("Indices inválidos");
        else {
            System.out.println("Subcadeia invertida obtida: " + subCadeiaInv);
            System.out.println("Comprimento da subcadeia invertida: " + subCadeiaInv.length());
        }
        System.out.println("\n\t\tFIM DE PROGRAMA");
        scan.close();
    }
}