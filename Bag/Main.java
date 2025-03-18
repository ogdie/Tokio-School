import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Bag> myBag = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        boolean rodando = true;

        while(rodando) {
            //**Sugiro comecar o programa Adicionando itens, depois lista-los e por fim remover.
            System.out.println("\n=== MOCHILA ===");
            System.out.println("1) Adicionar item à mochila"); //putInBag()
            System.out.println("2) Retirar item da mochila"); //takeFromBag()
            System.out.println("3) Listar itens da mochila");
            System.out.println("4) Sair");
            int opcao = scan.nextInt();

            switch (opcao) {
                case 1: //putInBag()
                    System.out.println("=== ADICIONAR ITENS ===");
                    System.out.println("Qual item deseja por na mochila?");
                    String material = scan.next();
                    Bag b = new Bag();
                    b.setItem(material);
                    myBag.add(b);
                    break;
                case 2: //takeFromBag()
                    System.out.println("=== RETIRAR ITENS ===");
                    for(int i = 0; i < myBag.size(); i++) {
                        Bag bTemp = myBag.get(i);
                        System.out.println("[" + i + "]" + bTemp.getItem());
                    }
                    int randItem = rand.nextInt(myBag.size());
                    System.out.println("Você retirou o item: " + randItem);
                    myBag.remove(randItem);
                    break;
                case 3:
                    System.out.println("=== ITENS CONTIDOS NA MOCHILA ===");
                    for(int i = 0; i < myBag.size(); i++) {
                        System.out.print("Item " + i + " - ");
                        System.out.println(myBag.get(i).getItem());
                    }
                    if(myBag.isEmpty()) {
                        System.out.println("Mochila vazia");
                    }
                    break;
                case 4:
                    rodando = false;
                    break;
            }
        }
    }
}