import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== Iterator Bag ===");

        Bag<Integer> b = new Bag<>();
        b.add(1);
        b.add(2);
        b.add(3);

        System.out.println("'for' com Iteradores");
        for(Iterator<Integer> i = b.iterator(); i.hasNext();) {
            System.out.println(i.next());
        }

        System.out.println("for each");
        for(Integer i: b) {
            System.out.println(i);
        }

        System.out.println("Extraindo um elemento aleatório");
        while(!b.isEmpty()) {
            System.out.println(b.extract());
        }
    }
}