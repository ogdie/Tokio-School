public class PessoalInfo extends PAS {

    public PessoalInfo() {}

    public PessoalInfo(String nome, String CC, String categoria, double salario, int horaExtra) {
        super(nome, CC, categoria, salario, horaExtra);
    }

    @Override
    public double calcularSalario() {
        double qtdHoras = 40;
        double valorHora = 6;
        int numSemana = 4;

        double salarioPI = (qtdHoras * valorHora * 4) + getHoraExtra();
        return salarioPI;
    }
}
