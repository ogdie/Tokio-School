import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Cidade> cidades = new ArrayList<Cidade>();
        cidades.add(new Cidade("Porto", "Porto", 214000));
        cidades.add(new Cidade("Lisboa", "Lisboa", 504000));
        cidades.add(new Cidade("Aveiro", "Aveiro", 80000));
        cidades.add(new Cidade("Elvas", "Alentejo", 20000));
        cidades.add(new Cidade("Evora", "Alentejo", 53000));
        cidades.add(new Cidade("Ermesinde", "Porto", 38000));
        cidades.add(new Cidade("Almada", "Lisboa", 88000));
        cidades.add(new Cidade("Braga", "Braga", 800000));
        cidades.add(new Cidade("Vila Nova de Famalicão", "Braga", 133000));
        cidades.add(new Cidade("Oliveira do Douro", "Porto", 22000));
        cidades.add(new Cidade("Vila Nova de Gaia", "Porto", 304000));

        System.out.println("1) Quantas cidades há no total?");
        System.out.println(cidades.stream().count());

        System.out.println("2) Quantas cidades do Porto tem mais de 1000 habitantes?");
        System.out.println(cidades.stream().filter(cidade -> cidade.getProvincia().equals("Porto")
                && cidade.getHabitantes() > 1000).count());

        System.out.println("3) De que distritos são as cidades?");
        cidades.stream().map(cidade -> cidade.getProvincia()).distinct().forEach(System.out::println);

        System.out.println("4) De quantos distritos diferentes são as cidades?");
        System.out.println(cidades.stream().map(cidade -> cidade.getProvincia()).distinct().count());

        System.out.println("5) Alguma cidade do Porto tem mais de 50000 habitantes?");
        System.out.println(cidades.stream().anyMatch(cidade -> cidade.getProvincia().equals("Porto")
        && cidade.getHabitantes() > 50000));
    }
}