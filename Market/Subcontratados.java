public class Subcontratados extends FuncionariosRepositores {
    private String especialidade;
    public Subcontratados() {
    }

    public Subcontratados(String nome, String sobrenome, String numId, String morada, String telefone,
                          int numSegSocial, int salario, String turno, String especialidade) {
        super(nome, sobrenome, numId, morada, telefone, numSegSocial, salario, turno);
        this.especialidade = especialidade;
    }
    public String getEspecialidade() {
        return especialidade;
    }
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    @Override
    public String funcionariosMercado() {
        System.out.println("_________________________");
        System.out.println("===> Sub Contratados");
        System.out.println("_________________________");
        return getNome() + " " + getSobrenome() + "\nNum ID: " + getNumId() + "\nTelefone: " + getTelefone() +
                "\nNum Seg. Social: " + getNumSegSocial() + "\nSalario: " + getSalario() + "\nTurno: " + getTurno() +
                "\nEspecialidade: " + getEspecialidade();
    }
}
