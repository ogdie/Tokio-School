public class Animais {

    private String nome;
    private String raca;
    private String descricao;
    private Integer peso;
    private Integer altura;
    private Boolean perigoso;
    private String comida;
    private Integer qtdComida;

    public Animais(String nome, String raca, String descricao, Integer peso, Integer altura,
                   Boolean perigoso, String comida, Integer qtdComida) {
        this.nome = nome;
        this.raca = raca;
        this.descricao = descricao;
        this.peso = peso;
        this.altura = altura;
        this.perigoso = perigoso;
        this.comida = comida;
        this.qtdComida = qtdComida;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public Integer getAltura() {
        return altura;
    }

    public void setAltura(Integer altura) {
        this.altura = altura;
    }

    public Boolean getPerigoso() {
        return perigoso;
    }

    public void setPerigoso(Boolean perigoso) {
        this.perigoso = perigoso;
    }

    public String getComida() {
        return comida;
    }

    public void setComida(String comida) {
        this.comida = comida;
    }

    public Integer getQtdComida() {
        return qtdComida;
    }

    public void setQtdComida(Integer qtdComida) {
        this.qtdComida = qtdComida;
    }

    @Override
    public String toString() {
        return  "[Nome: " + nome + ", Raça: " + raca + ", Descricao: " + descricao +
                ", Peso: " + peso + ", Altura: " + altura +", Perigoso: " + perigoso +
                ", Comida: " + comida +", qtdComida: " + qtdComida +
                "]";
    }

    public boolean marcarComoPerigoso(boolean perigoso) {

        if (perigoso == true) {
            System.out.println(getNome() + " É perigoso");
        } else {
            System.out.println(getNome() + " Não é perigoso");
        }
        return perigoso;
    }

    public int alimentar(int quantidade) {
        int comidaTotal =  quantidade + getQtdComida();
        qtdComida = comidaTotal;
        return qtdComida;
    }
}
