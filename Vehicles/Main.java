import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);
    static Veiculo[] veiculos = new Veiculo[4];
    public static class Veiculo{
        static String marca;
        static int ano;
        public Veiculo(String marca, int ano) {
            this.marca = Veiculo.marca;
            this.ano = Veiculo.ano;
        }
        public static void exibirInfo(String marca, int ano){
            System.out.println("Marca: " + marca);
            System.out.println("Ano: " + ano);
            return;
        }
    }
    public static void main(String[] args) {
        System.out.println("* * Banco de dados da Oliveira do Douro Automoveis * *");
        int opcao;
        do {
            System.out.println("------------------------------------------------------");
            System.out.println("O que gostaria de adicionar?\n1)Carro\n2)Moto");
            opcao = scan.nextInt();

            switch (opcao) {
                case 1:
                    adicionarCarro();
                    break;
                default:
                    adicionarMoto();
            }
            System.out.println();
            System.out.println("Deseja adicionar outro veiculo?\n1)Sim\n2)Nao");
            opcao = scan.nextInt();
        } while (opcao == 1);
    }
    public static void adicionarCarro(){
        for (int i = 0; i < veiculos.length; i++) {
            if (veiculos[i] == null) {
                System.out.println("Informe os dados para adicionar o carro");
                System.out.println("Qual a marca?");
                String marca = scan.next();
                System.out.println("Qual o ano de fabricacao?");
                int ano = scan.nextInt();
                System.out.println("Quantas portas tem o carro?");
                int portas = scan.nextInt();
                veiculos[i] = new Veiculo(marca, ano);
                System.out.println();
                Veiculo.exibirInfo(marca, ano);
                System.out.println("Portas: " + portas);
                System.out.println("Carro adicionado com sucesso!");
                return;
            }
        }
        System.out.println("Nao e possivel adicionar mais veiculos. Limite atingido");
    }
    public static void adicionarMoto(){
        for (int i = 0; i < veiculos.length; i++) {
            if (veiculos[i] == null) {
                System.out.println("Informe os dados para adicionar a moto");
                System.out.println("Qual a marca?");
                String marca = scan.next();
                System.out.println("Qual o ano de fabricacao?");
                int ano = scan.nextInt();
                System.out.println("Qual o tipo da moto?");
                String tipo = scan.next();
                veiculos[i] = new Veiculo(marca, ano);
                System.out.println();
                Veiculo.exibirInfo(marca, ano);
                System.out.println("Tipo: " + tipo);
                System.out.println("Moto adicionado com sucesso!");
                return;
            }
        }
        System.out.println("Nao e possivel adicionar mais veiculos. Limite atingido");
    }
}