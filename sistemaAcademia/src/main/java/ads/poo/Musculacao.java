package ads.poo;

public class Musculacao extends Aula implements Descritivel {
    private String grupoMuscular;

    public Musculacao(String nome, int duracaoEmMinutos, String grupoMuscular) {
        super(nome, duracaoEmMinutos);
        this.grupoMuscular = grupoMuscular;
    }

    @Override
    public String getDescricao() {
        return String.format("""
                MUSCULAÇÃO:
                Grupo Muscular: %s
                Tempo de Duração: %d minutos""", grupoMuscular, duracaoEmMinutos);
    }
}
