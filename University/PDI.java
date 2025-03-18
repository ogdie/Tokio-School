public class PDI extends Pessoal {

    public PDI() {}
    public PDI(String nome, String CC, String categoria, double salario) {
        super(nome, CC, categoria, salario);
    }
    @Override
    public double calcularSalario() {
        double salarioPDI;
        salarioPDI = getSalario();
        return salarioPDI;
    }
}
