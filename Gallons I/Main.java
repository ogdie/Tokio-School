import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int peso;
        double gravidadeLua = 0.17;
        System.out.println("*** BEM VINDO A CALCULADORA DA LUA ***");
        System.out.print("Insira o peso terreo que deseja converter (kg): ");
        peso = scan.nextInt();
        System.out.println("Calculando... Calculando...");
        double pesoLua = (peso * gravidadeLua);
        System.out.println("O peso lunar é: " + pesoLua + " kg");
    }
}