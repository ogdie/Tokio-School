import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);
    static Animal[] animais = new Animal[2];

    public static class Animal {
        static String nome;

        public Animal(String nome) {
            this.nome = nome;
        }
        public static String emitirSom(){
            System.out.println("Olha so, esta emitindo um som depois que soube o nome.");
            return "";
        }
    }

    public static void main(String[] args) {
        System.out.println("**BEM VINDO AO CENTRO DE ADOCAO DE ANIMAIS!!**");
        System.out.println("Voce adotou um gato e um cachorro, que nome dará a eles?");
        System.out.println();
        for (int i = 0; i < animais.length; i++){
            System.out.println("Vamos comecar pelo gatinho, e um macho, qual nome gostaria de da-lo?");
            String nomeGato = scan.next();
            animais[i] = new Animal(nomeGato);
            Animal.emitirSom();
            System.out.print("O " + nomeGato);
            System.out.println(Gato.miarGato());


            System.out.println();
            System.out.println("Agora e a vez do cachorro, melhor dizendo, cadela!! Qual nome gostaria?");
            String nomeCao = scan.next();
            animais [i] = new Animal(nomeCao);
            Animal.emitirSom();
            System.out.print("A " + nomeCao);
            System.out.println(Cao.latirCao());
            System.out.println();
            System.out.println("Parabens, esses pequeninos encherao sua vida de amor e alegria!");
            return;
        }
    }
}