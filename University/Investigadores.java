public class Investigadores extends PDI {

    public Investigadores() {}

    public Investigadores(String nome, String CC, String categoria, double salario) {
        super(nome, CC, categoria, salario);
    }

    @Override
    public double calcularSalario() {
        double qtdHoras = 35;
        double valorHora = 7;
        int numSemana = 4;
        double salarioInv;

        salarioInv = qtdHoras * valorHora * numSemana;
        return salarioInv;
    }
}
