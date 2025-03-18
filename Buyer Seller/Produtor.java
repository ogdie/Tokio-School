import java.util.List;

public class Produtor implements Runnable {

    private List<Integer> lista;
    private final int CAPACIDADE = 10;
    private int contador = 0;

    public Produtor(List<Integer> lista) {
        this.lista = lista;
    }

    @Override
    public void run() {
        while (true) {
            try {
                produzir();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void produzir() throws InterruptedException {
        synchronized (lista) {
            while (lista.size() == CAPACIDADE) {
                System.out.println("A capacidade da lista está cheia." +
                        " O produtor está esperando.");
                lista.wait();
            }
        }
        synchronized (lista) {
            lista.add(contador++);
            System.out.println("Foi produzido o elemento " + contador);
            lista.notifyAll();
        }
    }
}
