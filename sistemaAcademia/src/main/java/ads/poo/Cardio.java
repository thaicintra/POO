package ads.poo;

public class Cardio extends Aula implements Descritivel {
    Intensidade intensidade;

    public Cardio(String nome, int duracaoEmMinutos, Intensidade intensidade) {
        super(nome, duracaoEmMinutos);
        this.intensidade = intensidade;
    }

    @Override
    public String getDescricao() {
        return String.format("""
                CARDIO:
                Intensidade: %s
                Duração: %d minutos""", intensidade, duracaoEmMinutos);
    }
}
