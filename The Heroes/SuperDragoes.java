public class SuperDragoes implements Lutador{
    public String nome;
    public int hp;
    public int pontosAtaque;
    public int newLife = 10;

    public int atacar(int hpAlvo){
        return hpAlvo - pontosAtaque;
    }
    public int defender(int hpAlvo){
        return hpAlvo - (pontosAtaque - 2);
    }
    public int obterVida(int hpPessoal){
        hpPessoal = newLife;
        return hpPessoal;
    }
}
