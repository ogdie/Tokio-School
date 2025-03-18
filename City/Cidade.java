public class Cidade {

    private String nome;
    private String provincia;
    private int habitantes;

    public Cidade(String nome, String provincia, int habitantes) {
        this.nome = nome;
        this.provincia = provincia;
        this.habitantes = habitantes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public int getHabitantes() {
        return habitantes;
    }

    public void setHabitantes(int habitantes) {
        this.habitantes = habitantes;
    }
}
