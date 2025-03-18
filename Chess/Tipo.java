public enum Tipo {

    PEAO(1),
    TORRE(5),
    VALETE(3),
    BISPO(3),
    DAMA(9),
    REI(0);

    private final int valorTipo;
    
    private Tipo(int valorTipo) {
        this.valorTipo = valorTipo;
    }

    public int getValorTipo() {
        return valorTipo;
    }
}
