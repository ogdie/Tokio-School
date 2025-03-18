public class Main {
    public static void main(String[] args) {

        Circulo circulo = new Circulo();
        circulo.setRaio(4);

        Cilindro cilindro = new Cilindro();
        cilindro.setRaio(2);
        cilindro.setAltura(3);

        Figura[] figuras = new Figura[2];
        figuras[0] = circulo;
        figuras[1] = cilindro;

        System.out.println("==> Circulo");
        System.out.println("Raio: " + circulo.getRaio());
        System.out.println("Área: " + circulo.calcularArea());
        System.out.println("Perímetro: " + circulo.calcularPerimetro());
        System.out.println("-----------------------------");
        System.out.println("==> Cilindro");
        System.out.println("Raio: " + cilindro.getRaio());
        System.out.println("Altura: " + cilindro.getAltura());
        System.out.println("Área: " + cilindro.calcularArea());
        System.out.println("Volume: " + cilindro.calcularVolume());
        System.out.println("-----------------------------");
        System.out.println("Total dos Raios das Figuras: " + (circulo.getRaio() + cilindro.getRaio()));
    }
}