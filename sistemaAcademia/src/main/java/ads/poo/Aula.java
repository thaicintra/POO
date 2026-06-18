package ads.poo;

public abstract class Aula {
    protected String aula;
    protected int duracaoEmMinutos;

    public Aula(String aula, int duracaoEmMinutos) {
        this.aula = aula;
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public String getAula() {
        return aula;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }
}
