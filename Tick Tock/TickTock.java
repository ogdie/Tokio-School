public class TickTock implements Runnable {

    @Override
    public void run() {
        try {
            Thread.currentThread().sleep(500);
            System.out.println("Tick-");
            Thread.currentThread().sleep(500);
            System.out.println("Tock");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
