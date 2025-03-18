import java.util.ArrayList;
import java.util.List;

public class Universidade {
    static List<Pessoal> list = new ArrayList<Pessoal>();
    static PAS diretora = new PessoalAdm();
    static PAS digitador = new PessoalInfo();
    static PDI investigador = new Investigadores();
    static Professores professor1 = new Professores();
    static Professores professor2 = new Professores();

    public static void imprimirNominas(){

        diretora.setCategoria("PAS");
        diretora.setNome("Isabel Cristina");
        diretora.setCC("765324-9");
        diretora.setHoraExtra(16);
        diretora.setSalario(diretora.calcularSalario());
        list.add(diretora);

        digitador.setCategoria("PAS");
        digitador.setNome("Rodrigo Marinho");
        digitador.setCC("354800-1");
        digitador.setHoraExtra(12);
        digitador.setSalario(digitador.calcularSalario());
        list.add(digitador);

        investigador.setCategoria("PDI");
        investigador.setNome("Raíza Albuquerque");
        investigador.setCC("980090-3");
        investigador.setSalario(investigador.calcularSalario());
        list.add(investigador);

        professor1.setCategoria("PDI");
        professor1.setNome("Jorge Monteiro");
        professor1.setCC("765784-0");
        professor1.setNumAnos(10);
        professor1.setSalario(professor1.calcularSalario());
        list.add(professor1);

        professor2.setCategoria("PDI");
        professor2.setNome("Diego Menezes");
        professor2.setCC("354009-0");
        professor2.setNumAnos(2);
        professor2.setSalario(professor2.calcularSalario()  );
        list.add(professor2);

        System.out.println("===> QUADRO DE FUNCIONÁRIOS");
        System.out.println("Categoria: " + diretora.getCategoria() + "\nNome: " + diretora.getNome() +
                "\nCC: " + diretora.getCC() + "\nTotal de Horas Extras: $" + diretora.getHoraExtra() +
                "\nSalario: " + diretora.getSalario() + "\n");
        System.out.println("Categoria: " + digitador.getCategoria() + "\nNome: " + digitador.getNome() +
                "\nCC: " + digitador.getCC() + "\nTotal de Horas Extras: $" + digitador.getHoraExtra() +
                "\nSalario: " + digitador.getSalario() + "\n");
        System.out.println("Categoria: " + investigador.getCategoria() + "\nNome: " + investigador.getNome() +
                "\nCC: " + investigador.getCC() + "\nSalario: " + investigador.getSalario() + "\n");
        System.out.println("Categoria: " + professor1.getCategoria() + "\nNome: " + professor1.getNome() +
                "\nCC: " + professor1.getCC() + "\nTotal de anos de trabalho: " + professor1.getNumAnos() +
                "\nBónus de Sexénio:  $100" + "\nSalário: " + professor1.getSalario() + "\n");
        System.out.println("Categoria: " + professor2.getCategoria() + "\nNome: " + professor2.getNome() +
                "\nCC: " + professor2.getCC() + "\nTotal de anos de trabalho: " + professor2.getNumAnos() +
                "\nBónus de Sexénio: Não" + "\nSalário: " + professor2.getSalario());
    }
    public static double orcamentoTotal() {
        double gastoTotal;
        gastoTotal = (diretora.getSalario() + digitador.getSalario() + investigador.getSalario() + professor1.getSalario() +
                professor2.getSalario());
        return gastoTotal;
    }

}
