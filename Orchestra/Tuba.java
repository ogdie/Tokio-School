public class Tuba extends Instrumentos{

    public Tuba() {
    }

    @Override
    public String tocar(String nota) {
        return "Soprar ... Tuba (Nota " + nota + ")";
    }
}
