package ads.poo;

import java.time.LocalDate;

/**
 * EMPRESTIMO - Associa Usuario + Livro + Data
 * --> Usuario é simples, sem lista de empréstimos
 */
public class Emprestimo {
    private Usuario usuario;
    private Livro livro;
    private LocalDate data;

    public Emprestimo(Usuario usuario, Livro livro) {
        this.usuario = usuario;
        this.livro = livro;
        this.data = LocalDate.now();
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Livro getLivro() {
        return livro;
    }

    @Override
    public String toString() {
        return usuario.getNome() + " -> " + livro.getTitulo() + " (em " + data + ")";
    }
}
