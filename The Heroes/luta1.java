import java.util.Scanner;

public class luta1 {
    public static void lutar(Viloes vilao1, SuperDragoes dragao1) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Primeira Luta!" + "\nMr. Pinto da Costa X Frederico Varandas");
        while (true){
            System.out.println("1) Atacar" + "\n2) Defender" + "\n3) Recuperar Vida");
            int opcao = scan.nextInt();

            if (opcao == 1) {
                vilao1.hp = dragao1.atacar(vilao1.hp);
                System.out.println(dragao1.nome + " atacou e retirou pontos de vida de " + vilao1.nome);
                System.out.println("Pontos de Vida do " + vilao1.nome + " : " + vilao1.hp);
                dragao1.hp = vilao1.atacar(dragao1.hp);
                System.out.println(vilao1.nome + " contra atacou e retirou pontos de vida de " + dragao1.nome);
                System.out.println("Pontos de vida do " + dragao1.nome + " : " + dragao1.hp);
            }
            if (dragao1.hp <= 0 || vilao1.hp <= 0){
                break;
            }
            if (opcao == 2) {
                dragao1.hp = vilao1.defender(dragao1.hp);
                System.out.println(vilao1.nome + " tenta um ataque surpresa!!");
                System.out.println(dragao1.nome + " utiliza o escudo do Dragao, reduzindo o dano do ataque adversario pela metade");
                System.out.println("Pontos de Vida do " + dragao1.nome + " : " + dragao1.hp);
                System.out.println("Pontos de Vida do " + vilao1.nome + " : " + vilao1.hp);
            }
            if (dragao1.hp <= 0 || vilao1.hp <= 0) {
                break;
            }
            if (opcao == 3) {
                dragao1.hp = dragao1.obterVida(dragao1.hp);
                System.out.println(dragao1.nome + " utilizou a semente do Dragao, recuperou sua vida e ganha imunidade por 1 turno");
                System.out.println("Pontos de Vida do " + dragao1.nome + " : " + dragao1.hp);
                System.out.println(vilao1.nome + " atacou, mas o escudo do adversario absorveu o dano");
                System.out.println("Pontos de Vida do " + vilao1.nome + " : " + vilao1.hp);
            }
        }
        if (dragao1.hp <= 0 && vilao1.hp <= 0){
            System.out.println("Empate!");
        }
        else if (dragao1.hp <= 0){
            System.out.println("Oh, nao! O Super Dragao foi derrotado");
        }
        else if (vilao1.hp <= 0){
            System.out.println("Grauuurrr!! Super Dragoes Venceu!! ");
        }
    }
}
