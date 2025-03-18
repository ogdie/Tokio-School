import java.util.List;

public class Consumidor implements Runnable {

    private List<Integer> lista;

    public Consumidor(List<Integer> lista) {
        this.lista = lista;
    }

    @Override
    public void run() {
        while (true) {
            try {
                consumir();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void consumir() throws InterruptedException {
        synchronized (lista) {
            while (lista.isEmpty()) {
                System.out.println("A lista está vazia. O consumidor fica esperando.");
                lista.wait();
            }
        }
        synchronized (lista) {
            System.out.println("Foi consumido o elemento " + lista.remove(0));
            lista.notifyAll();
        }
    }
}
