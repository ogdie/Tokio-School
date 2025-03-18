public class Peca {

    private Cor cor;
    private Tipo tipo;

    public Peca(Cor cor, Tipo tipo) {
        this.cor = cor;
        this.tipo = tipo;
    }

    public Cor getCor() {
        return cor;
    }

    public Tipo getTipo() {
        return tipo;
    }
}
