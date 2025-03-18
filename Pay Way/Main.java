import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);
    public static class FormaDePagamento {
        public static void processarPagamento(){
            System.out.println("O Pagamento esta sendo processado....");
        }
    }
    public static void main(String[] args) {
        System.out.println("Selecione qual metodo de pagamento deseja:");
        System.out.println("1) PayPal");
        System.out.println("2) Cartao de Credito");
        int opcao = scan.nextInt();

        if (opcao == 1) {
            FormaDePagamento.processarPagamento();
            PayPal.processarPagamento();
        } else {
            FormaDePagamento.processarPagamento();
            CartaoCredito.processarPagamento();
        }
    }
}