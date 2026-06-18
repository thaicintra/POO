package ads.poo;

public abstract class Conteudo {
    protected String titulo;
    protected int duracao;

    public Conteudo(String titulo, int duracao) {
        this.titulo = titulo;
        this.duracao = duracao;
    }

    public String getTitulo() {
        return titulo;
    };

    public abstract int getDuracao();

}
