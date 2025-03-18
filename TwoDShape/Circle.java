public class Circle extends TwoDShape{
    double r;
    final double pi = 3.1416;

    public Circle(int r){
        this.r = r;
    }
    public Circle(double base, double altura, double r) {
        super(base, altura);
        this.r = r;
    }
    public void calcularArea() {
        double area = pi * (r * r);
        System.out.println(area);
    }
}
