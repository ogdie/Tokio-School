public class Main extends Retangulo {

    public static void main(String[] args) {

        Retangulo ret1 = new Retangulo(); // Retangulo do construtor padrão;
        System.out.println("Retangulo A");
        System.out.print("Base: " + ret1.base);
        System.out.print("\nAltura: " + ret1.altura);
        System.out.println();
        ret1.Esquadria();
        ret1.Area();
        ret1.Perimetro();
        ret1.Girar();

        System.out.println();
        Retangulo ret2 = new Retangulo(5,5);
        System.out.println("Retangulo B");
        System.out.print("Base: " + ret2.base);
        System.out.print("\nAltura: " + ret2.altura);
        System.out.println();
        ret2.Esquadria();
        ret2.Area();
        ret2.Perimetro();
        ret2.Girar();

        System.out.println();
        Retangulo ret3 = new Retangulo(10,8);
        System.out.println("Retangulo C");
        System.out.print("Base: " + ret3.base);
        System.out.print("\nAltura: " + ret3.altura);
        System.out.println();
        ret3.Esquadria();
        ret3.Area();
        ret3.Perimetro();
        ret3.Girar();
    }
}