import java.util.Scanner;

public class Main {
    static int gumPrice = 3;
    static int chocolateBarPrice = 5;
    static int numChocolatBars = 0;
    static int numOfGumBalls = 0;

    public static void candyCalculator(int credits){
        numChocolatBars = credits / chocolateBarPrice;
        numOfGumBalls = (credits % chocolateBarPrice) / gumPrice;

    }
    public static void main(String[] args) {

        int troco;
        int totalCompras;

        Scanner scan = new Scanner(System.in);

        System.out.println("** Bem vindo à Candy Machine **");
        System.out.println();
        System.out.println("Opcoes de doces:\n1) Barra de Chocolate (5$)\n2) Chiclete ($3)");
        System.out.println();
        System.out.println("Quantos créditos tens?");
        int credits = scan.nextInt();
        
        candyCalculator(credits);
        totalCompras = ((numChocolatBars * chocolateBarPrice) + (numOfGumBalls * gumPrice));
        troco = credits % totalCompras;

        System.out.println(credits + "$. Da pra voce levar " + numChocolatBars + " barra(s) de chocolate e "
                + numOfGumBalls + " chiclete(s).");
        System.out.println("O total das compras foi: " + totalCompras + "$");
        System.out.println("O seu troco e: " + troco + "$");
    }
}