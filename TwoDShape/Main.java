import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("=== AREA DO CIRCULO ==");
        System.out.print("Informe o raio: ");
        int r = scan.nextInt();

        Circle c = new Circle(r);
        c.calcularArea();



    }
}