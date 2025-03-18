public abstract class Mercado {
    private String nome, sobrenome, numId, morada, telefone;
    public Mercado() {
    }
    public Mercado(String nome, String sobrenome, String numId, String morada, String telefone) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.numId = numId;
        this.morada = morada;
        this.telefone = telefone;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSobrenome() {
        return sobrenome;
    }
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    public String getNumId() {
        return numId;
    }
    public void setNumId(String numId) {
        this.numId = numId;
    }
    public String getMorada() {
        return morada;
    }
    public void setMorada(String morada) {
        this.morada = morada;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Mercado{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", numId='" + numId + '\'' +
                ", morada='" + morada + '\'' +
                ", telefone='" + telefone + '\'' +
                '}';
    }

    public abstract String funcionariosMercado();
}
