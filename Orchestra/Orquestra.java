import java.util.ArrayList;
import java.util.List;

public class Orquestra {

    static List<Instrumentos> listaInstrumentos = new ArrayList<Instrumentos>();
    static Instrumentos tuba = new Tuba();
    static Instrumentos saxofone = new Saxofone();
    static Instrumentos violino = new Violino();
    static Instrumentos xilofone = new Xilofone();

    public static String tocar(String nota) {

        listaInstrumentos.add(tuba);
        listaInstrumentos.add(saxofone);
        listaInstrumentos.add(violino);
        listaInstrumentos.add(xilofone);

        System.out.println(tuba.tocar("Dó"));
        System.out.println(saxofone.tocar("Dó"));
        System.out.println(violino.tocar("Dó"));
        System.out.println(xilofone.tocar("Dó"));
        return "=== APLAUSOS PARA A ORQUESTRA ===";
    }


}
