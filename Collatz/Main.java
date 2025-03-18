public class Main {
    static void printCollatz(int n){
        System.out.print("[ ");
        while (n != 1){
            System.out.print(n + " ");
            if (n % 2 == 0)
                n = n / 2;
            else
                n = (3 * n + 1);
        }
        System.out.println(n + " ]");
    }
    public static void main(String[] args) {
        printCollatz(6);
    }
}