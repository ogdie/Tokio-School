public class PAS extends Pessoal {

    private int horaExtra;
    int valorHoraExtra = 6;

    public PAS() {}
    public PAS(String nome, String CC, String categoria, double salario, int horaExtra) {
        super(nome, CC, categoria, salario);
        this.horaExtra = horaExtra;
    }
    public int getHoraExtra() {
        return horaExtra * valorHoraExtra;
    }
    public void setHoraExtra(int horaExtra) {
        this.horaExtra = horaExtra;
    }
    @Override
    public double calcularSalario() {
        double salarioPAS;

        salarioPAS = getSalario() + (getHoraExtra());
        return salarioPAS;
    }
}
