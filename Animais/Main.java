import java.util.ArrayList;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {

        ArrayList<Animais> animais = new ArrayList<>();

        Animais cachorro = new Animais("Kaya", "Vira Lata Caramelo",
                "Mamífero", 19, 2, false, "Proplan",
                2);

        Animais tubarao = new Animais("Mag", "Tubarão Branco",
                "Ovíparo/Vivíparo", 100, 5, true, "Carne",
                80);

        Animais gato = new Animais("Hash", "Siamês", "Mamífero", 8,
                1, false, "Proplan", 1);

        Animais leao = new Animais("Simba", "Leão do Congo", "Mamífero",
                90, 3, true, "Carne", 60);

        animais.add(0, cachorro);
        animais.add(1, tubarao);
        animais.add(2, gato);
        animais.add(3, leao);

        System.out.println("Lista de Animais: ");
        System.out.println(cachorro);
        System.out.println(tubarao);
        System.out.println(gato);
        System.out.println(leao);
        System.out.println();

        tubarao.alimentar(10);
        leao.alimentar(20);
        System.out.println("Utilizando o método alimentar: ");
        System.out.println(tubarao);
        System.out.println(leao);
        System.out.println();

        System.out.println("Listando o nome de todos os animais: ");
        Consumer<String> imprimirNomes = nomes -> System.out.println(cachorro.getNome() +
                "\n" + tubarao.getNome() + "\n" + gato.getNome() + "\n" + leao.getNome());
        imprimirNomes.accept("");

        System.out.println();

        System.out.println("Adicionando mais 10kg de comida para todos os animais: ");
        Consumer<Integer> addComidaCao = comida -> cachorro.alimentar(10);
        Consumer<Integer> addComidaTubarao = comida -> tubarao.alimentar(10);
        Consumer<Integer> addComidaGato = comida -> gato.alimentar(10);
        Consumer<Integer> addComidaLeao = comida -> leao.alimentar(10);
        addComidaCao.accept(10);
        addComidaTubarao.accept(10);
        addComidaGato.accept(10);
        addComidaLeao.accept(10);
        System.out.println(cachorro);
        System.out.println(tubarao);
        System.out.println(gato);
        System.out.println(leao);
        System.out.println();

        System.out.println("Marcando animais perigosos");
        cachorro.marcarComoPerigoso(false);
        tubarao.marcarComoPerigoso(true);
        gato.marcarComoPerigoso(false);
        leao.marcarComoPerigoso(true);
        System.out.println();

        System.out.println("Removendo animais perigosos: ");
        Consumer<Animais> tubPerigoso = perigosos -> animais.remove(1);
        Consumer<Animais> leaoPerigoso = perigosos -> animais.remove(2);
        tubPerigoso.accept(tubarao);
        leaoPerigoso.accept(leao);
        System.out.println(animais);
        System.out.println();

        animais.add(tubarao);
        animais.add(leao);
        System.out.println("Removendo animais com menos de 10 kg: ");
        Consumer<Animais> menosDezKg = leve -> animais.remove(1);
        menosDezKg.accept(gato);
        System.out.println(animais);
        System.out.println();

    }
}