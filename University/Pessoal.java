public abstract class Pessoal {

    private String nome, CC, categoria;
    private double salario;

    public Pessoal() {}
    public Pessoal(String nome, String CC, String categoria, double salario) {
        this.nome = nome;
        this.CC = CC;
        this.categoria = categoria;
        this.salario = salario;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCC() {
        return CC;
    }
    public void setCC(String CC) {
        this.CC = CC;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public abstract double calcularSalario();
}
