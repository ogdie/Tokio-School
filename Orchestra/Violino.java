public class Violino extends Instrumentos {

    public Violino() {
    }

    @Override
    public String tocar(String nota) {
        return "Vibrar ... Violino (Nota " + nota + ")";
    }
}
