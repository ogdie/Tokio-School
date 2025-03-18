
public class Tabuleiro {

    private Peca[][] tabuleiro = new Peca[8][8];

    public Tabuleiro() {

        for (int i = 0; i < 8; i++) {
            tabuleiro[1][i] = new Peca(Cor.BRANCA, Tipo.PEAO);
            tabuleiro[6][i] = new Peca(Cor.PRETA, Tipo.PEAO);
        }
    }

    public Tabuleiro(Peca[][] tabuleiro) {
        this.tabuleiro = tabuleiro;
    }
}
