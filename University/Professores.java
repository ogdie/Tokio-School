public class Professores extends PDI {

    private int numAnos;

    public Professores() {}

    public Professores(String nome, String CC, String categoria, double salario, int numAnos) {
        super(nome, CC, categoria, salario);
        this.numAnos = numAnos;
    }
    public int getNumAnos() {
        return numAnos;
    }
    public void setNumAnos(int numAnos) {
        this.numAnos = numAnos;
    }
    @Override
    public double calcularSalario() {
        int sexenio = 100;
        double qtdHoras = 37;
        double valorHora = 8;
        int numSemana = 4;
        double salarioProf;
        if(getNumAnos() >= 6) {
            salarioProf = (qtdHoras * valorHora * numSemana) + sexenio;
        } else {
            salarioProf = qtdHoras * valorHora * numSemana;
        }
        return salarioProf;
    }
}
