import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);
    static Carro[] carros = new Carro[3];
    public static class Carro{
        static String vencedor;
        private String nome;
        private int velocidade;

        public Carro(String nome, int velocidade) {
            this.nome = nome;
            this.velocidade = velocidade;
        }
    }
    public static void main(String[] args) {
        carros[0] = new Carro("SEAT Ibiza", 200);
        carros[1] = new Carro("Renault Clio", 195);
        carros[2] = new Carro("Opel Corsa", 205);

        int opcao;
        System.out.println("BEM VINDO A CORRIDA DE CARROS!!");
        System.out.println("Testes suas habilidades em uma corrida alucinante ao longo de 250km de asfalto em linha reta!");
        System.out.println("Escolha o carro que deseja:");
        System.out.println("1) SEAT Ibiza");
        System.out.println("2) Renault Clio");
        System.out.println("3) Opel Corsa");
        opcao = scan.nextInt();
        System.out.println("A corrida terminou!!!\nCLASSIFICACAO:");

            switch (opcao){
                case 1:
                    correr();
                    System.out.println("Voce terminou em 2º lugar!");
                    break;
                case 2:
                    correr();
                    System.out.println("Voce terminou em 3º lugar!");
                    break;
                default:
                    correr();
                    System.out.println("PARABENS!! Voce terminou em 1º lugar!");
            }
    }
    public static void correr() {
        String formato = "#.##";
        DecimalFormat df = new DecimalFormat(formato);
        double distancia = 250;
        double tempoIbiza = distancia / carros[0].velocidade;
        double tempoClio = distancia / carros[1].velocidade;
        double tempoCorsa = distancia / carros[2].velocidade;
        System.out.println("1º - " + carros[2].nome + " : " + carros[2].velocidade + "/km - " + df.format(tempoCorsa) + " horas/minutos");
        System.out.println("2º - " + carros[0].nome + " : " + carros[0].velocidade + "/km - " + df.format(tempoIbiza) + " horas/minutos");
        System.out.println("3º - " + carros[1].nome + " : " + carros[1].velocidade + "/km - " + df.format(tempoClio) + " horas/minutos");
    }
    }
