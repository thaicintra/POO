package ads.poo;

import java.time.LocalDate;

public class Exibicao {
    private Conteudo conteudo;
    private Usuario usuario;
    private LocalDate data;

    public Exibicao(Conteudo conteudo, Usuario usuario, LocalDate data) {
        this.conteudo = conteudo;
        this.usuario = usuario;
        this.data = data;
    }

    public Conteudo getConteudo() {
        return conteudo;
    }

    public Usuario getUsuario() {
        return usuario;
    }
}
