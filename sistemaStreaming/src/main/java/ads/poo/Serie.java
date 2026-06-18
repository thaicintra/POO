package ads.poo;

public class Serie extends Conteudo {
    private int numeroEpisodios;

    public Serie(String titulo, int duracao, int numeroEpisodios) {
        super(titulo, duracao);
        this.numeroEpisodios = numeroEpisodios;
    }

    @Override
    public int getDuracao() {
        return duracao * numeroEpisodios;
    }
}
