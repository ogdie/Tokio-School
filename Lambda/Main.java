public class Main {

    static RecFunction fatorial = null;

    public static void main(String[] args) {

        fatorial = n -> {
            if (n == 0) {
                return 1;
            } else {
                return n * fatorial.recursiveFunction (n - 1);
            }
        };
        System.out.println (fatorial.recursiveFunction(5));
    }
}