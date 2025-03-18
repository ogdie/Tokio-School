public class FuncionariosRepositores extends Mercado {

    private int numSegSocial;
    private int salario;
    private String turno;
    public FuncionariosRepositores() {
    }
    public FuncionariosRepositores(String nome, String sobrenome, String numId, String morada,
                                   String telefone, int numSegSocial, int salario, String turno) {
        super(nome, sobrenome, numId, morada, telefone);
        this.numSegSocial = numSegSocial;
        this.salario = salario;
        this.turno = turno;
    }
    public int getNumSegSocial() {
        return numSegSocial;
    }
    public void setNumSegSocial(int numSegSocial) {
        this.numSegSocial = numSegSocial;
    }
    public int getSalario() {
        return salario;
    }
    public void setSalario(int salario) {
        this.salario = salario;
    }
    public String getTurno() {
        return turno;
    }
    public void setTurno(String turno) {
        this.turno = turno;
    }
    public double obterAdicional() {
        double salarioAdc;
        if (getTurno().equalsIgnoreCase("Noite")) {
            salarioAdc = getSalario() + 150;
            return salarioAdc;
        } else {
            return getSalario();
        }
    }
    @Override
    public String funcionariosMercado() {
        System.out.println("____________________________");
        System.out.println("===> Funcionarios e Repositores");
        System.out.println("____________________________");
        return getNome() + " " + getSobrenome() + "\nNum ID: " + getNumId() + "\nTelefone: " + getTelefone() +
                "\nNum Seg. Social: " + getNumSegSocial() + "\nSalario: " + getSalario() + "\nTurno: " + getTurno();
    }
}
