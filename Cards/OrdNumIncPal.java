import java.util.List;

public class OrdNumIncPal extends AlgoritmoOrdenacao {
    @Override
    public void ordena(List listaCartas) {
        for(int i = 0; i < listaCartas.size() - 1; i++) {
            for(int j = 0; j < listaCartas.size() - i - 1; j++) {
                int compara = comparadorCarta((Carta)listaCartas.get(j), (Carta)listaCartas.get(j+1));
                if(compara > 0) {
                    Object aux = listaCartas.get(j+1);
                    listaCartas.set(j+1, listaCartas.get(j));
                    listaCartas.set(j, aux);
                }
            }
        }
    }
    public static int comparadorCarta(Carta c1, Carta c2) {
        if (c1.equals(c2))
            return 0;
        else {
            if (c1.getNumero() == c2.getNumero())
                return c1.getNaipe().compareTo(c2.getNaipe());
            else {
                int posiC1 = 0, posiC2 = 0;
                for (int i = 0; i < Baralho.numeros.length; i++) {
                    if (c1.getNumero().equals(Baralho.numeros[i]))
                        posiC1 = i;
                    if (c2.getNumero().equals(Baralho.numeros[i]))
                        posiC2 = i;
                }
                if (posiC1 == posiC2)
                    return 0;
                else if (posiC1 < posiC2)
                    return -1;
                else
                    return 1;
            }
        }
    }
}
