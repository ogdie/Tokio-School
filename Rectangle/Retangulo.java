public class Retangulo {
    double base, altura;

    public Retangulo(double base, double altura) {
        this.base = Math.abs(base);
        this.altura = Math.abs(altura);
    }
    public Retangulo() {
        this.base = 2;
        this.altura = 1;
    }
    void Esquadria() {
        if (this.base == this.altura) {
            System.out.println("Esse retângulo é um quadrado!");
        } else {
            System.out.println("Isso é um retângulo padrão!");
        }
    }
    void Area() {
        double area;
        area = this.base * this.altura;
        System.out.println("A Área do Retangulo é: " + area);
    }
    void Perimetro() {
        double perimetro;
        perimetro = 2 * (this.base + this.altura);
        System.out.println("O Perimetro do Retangulo é: " + perimetro);
    }
    void Girar() {
        if (this.base != this.altura) {
            System.out.println("Após um giro de 90º ...");
            System.out.print("Nova Base: " + this.altura);
            System.out.print("\nNova Altura: " + this.base);
            System.out.println();
        } else {
            System.out.println("Isso é um quadrado, logo, tem sempre os mesmos lados");
        }
    }
}
