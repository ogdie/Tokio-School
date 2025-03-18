public class Main {
    public static void main(String[] args) {

        System.out.println("=== Generic Bag ===");
        Bag<String> bag = new Bag<String>();
        bag.add("Notebook");
        bag.add("Tablet");
        bag.add("Celular");
        bag.add("Relógio");

        System.out.println("A Bag está vazia? -> " + bag.isEmpty());
        System.out.println("Quantos elementos tem na Bag? -> " + bag.size());
        System.out.println("Há um Celular na Bag? -> " + bag.contains("Celular"));
        System.out.println("Há um Caderno na Bag? -> " + bag.contains("Caderno"));
        System.out.println("Retirando um elemento aleatório da Bag -> " + bag.extract());
        System.out.println("\nEliminando todos os elementos da Bag.........");
        bag.clear();
        System.out.println("A Bag está vazia? -> " + bag.isEmpty());
    }
}