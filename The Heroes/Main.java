import java.util.Scanner;

public class Main {

    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        SuperDragoes dragao1 = new SuperDragoes();
        dragao1.nome = "Mr. Pinto da Costa";
        dragao1.pontosAtaque = 5;
        dragao1.hp = 10;

        Viloes vilao1 = new Viloes();
        vilao1.nome = "Frederico Varandas";
        vilao1.pontosAtaque = 4;
        vilao1.hp = 10;

        Viloes vilao2 = new Viloes();
        vilao2.nome = "Rui Costa";
        vilao2.pontosAtaque = 4;
        vilao2.hp = 10;

        System.out.println("*** BEM VINDOS AO MASSACRE DOS SUPER DRAGOES!! ***");
        System.out.println("Conheça os nossos lutadores:");
        System.out.println();
        System.out.println(dragao1.nome + "\nPontos de Ataque: " + dragao1.pontosAtaque
                + "\nHP: " + dragao1.hp);
        System.out.println("---------------------------------------------------");
        System.out.println(vilao1.nome + "\nPontos de Ataque: " + vilao1.pontosAtaque
                + "\nHP: " + vilao1.hp);
        System.out.println("---------------------------------------------------");
        System.out.println(vilao2.nome + "\nPontos de Ataque: " + vilao2.pontosAtaque
                + "\nHP: " + vilao2.hp);
        System.out.println("---------------------------------------------------");
        luta1.lutar(vilao1, dragao1);
        luta2.lutar(vilao2, dragao1);
    }
}