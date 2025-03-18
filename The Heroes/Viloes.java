public class Viloes implements Lutador{
    public String nome;
    public int hp;
    public int pontosAtaque;

    public int atacar(int hpAlvo){
        return hpAlvo - pontosAtaque;
    }
    public int defender(int hpAlvo){
        return hpAlvo - (pontosAtaque - 2);
    }
    public int obterVida(int hpPessoal){
        return hpPessoal;
    }
}
