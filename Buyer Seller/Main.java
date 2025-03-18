import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {

        List<Integer> lista = new ArrayList<Integer>();

        Produtor p = new Produtor(lista);
        Consumidor c = new Consumidor(lista);

        Thread produtor = new Thread(p);
        Thread consumidor = new Thread(c);

        produtor.start();
        consumidor.start();

        produtor.join();
        consumidor.join();
    }
}