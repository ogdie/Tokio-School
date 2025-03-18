public class Main {
    public static void main(String[] args) {

        System.out.println("**** SISTEMA BANCARIO ****");
        System.out.println("CLIENTES INSTANCIADOS");

        contaBancaria cliente1 = new contaBancaria();
        contaBancaria cliente2 = new contaBancaria();
        contaBancaria cliente3 = new contaBancaria();

        cliente1.setNomeTitular("Diego Monteiro");
        cliente1.setNumeroConta(12365478);
        cliente1.setSaldo(50.25);
        cliente2.setNomeTitular("Raiza Marinho");
        cliente2.setNumeroConta(32145698);
        cliente2.setSaldo(98.45);
        cliente3.setNomeTitular("Rodrigo Marinho");
        cliente3.setNumeroConta(87645328);
        cliente3.setSaldo(7.15);

        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(cliente3);

        cliente1.depositar(100);
        cliente2.depositar(150);
        cliente3.depositar(10);
        System.out.println();
        System.out.println("DEPOSITOS EFETUADOS");
        System.out.println("O cliente " + cliente1.getNomeTitular() + " recebeu " + 100 + " Euros de deposito");
        System.out.println("O saldo da conta e: " + cliente1.getSaldo());
        System.out.println();
        System.out.println("O cliente " + cliente2.getNomeTitular() + " recebeu " + 150 + " Euros de deposito");
        System.out.println("O saldo da conta e: " + cliente2.getSaldo());
        System.out.println();
        System.out.println("O cliente " + cliente3. getNomeTitular() + " recebeu " + 10 + " Euros de deposito");
        System.out.println("O saldo da conta e: " + cliente3.getSaldo());

        cliente1.levantar(72.50);
        cliente2.levantar(107.70);
        cliente3.levantar(17.15);
        System.out.println();
        System.out.println("LEVANTAMENTOS EFETUADOS");
        System.out.println("O cliente " + cliente1.getNomeTitular() + " efetuou um levantamento de " + 72.50 + " euros.");
        System.out.println("O saldo atual da conta e: " + cliente1.getSaldo());
        System.out.println();
        System.out.println("O cliente " + cliente2.getNomeTitular() + " efetuou um levantamento de " + 107.70 + " euros.");
        System.out.println("O saldo atual da conta e: " + cliente2.getSaldo());
        System.out.println();
        System.out.println("O cliente " + cliente3.getNomeTitular() + " efetuou um levantamento de " + 17.15 + " euros.");
        System.out.println("O saldo atual da conta e: " + cliente3.getSaldo());
    }
}