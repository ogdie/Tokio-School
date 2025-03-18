import java.util.Scanner;

public class Main extends Rational {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o primeiro numero racional: ");
        System.out.print("a = ");
        int num1 = scan.nextInt();
        System.out.print("b = ");
        int den1 = scan.nextInt();
        Rational r1 = new Rational(num1, den1);

        System.out.println("Informe o segundo numero racional: ");
        System.out.print("c = ");
        int num2 = scan.nextInt();
        System.out.print("d = ");
        int den2 = scan.nextInt();
        Rational r2 = new Rational(num2, den2);

        System.out.print("Adição: ");
        Rational soma = r1.soma(r2);
        soma.imprimir();

        System.out.print("Subtração: ");
        Rational sub = r1.subtracao(r2);
        sub.imprimir();

        System.out.print("Multiplicação: ");
        Rational mult = r1.multiplicacao(r2);
        mult.imprimir();

        System.out.print("Divisão: ");
        Rational div = r1.divisao(r2);
        div.imprimir();
    }
}