public class PessoalAdm extends PAS {

    public PessoalAdm() {}

    public PessoalAdm(String nome, String CC, String categoria, double salario, int horaExtra) {
        super(nome, CC, categoria, salario, horaExtra);
    }

    @Override
    public double calcularSalario() {

        double qtdHoras = 37;
        double valorHora = 7.5;
        int numSemana = 4;

        double salarioPA = (qtdHoras * valorHora * numSemana) + getHoraExtra();
        return salarioPA;
    }
}
