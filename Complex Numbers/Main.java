public class Main extends ComplexNumber {

    public static void main(String[] args) {

        ComplexNumber c1 = new ComplexNumber(3, 2);
        c1.imprimirComplexNumber();

        ComplexNumber c2 = new ComplexNumber(9, 5);
        c2.imprimirComplexNumber();

        ComplexNumber c3 = new ComplexNumber();
        c3 = c3.addComplex(c1,c2);
        System.out.println("===> Soma: ");
        c3.imprimirComplexNumber();
        c3 = c3.subComplex(c1,c2);
        System.out.println("===> Subtração: ");
        c3.imprimirComplexNumber();
    }
}