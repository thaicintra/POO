package ads.poo;

import ads.poo.exceptions.ConteudoEmExibicaoException;
import ads.poo.exceptions.ConteudoNaoEmExibicaoException;
import ads.poo.exceptions.LimiteExibicoesException;
import ads.poo.exceptions.StreamingException;

import java.time.LocalDate;
import java.util.ArrayList;

public class Streaming {
    private ArrayList<Usuario> usuarios;
    private ArrayList<Conteudo> conteudos;
    private ArrayList<Exibicao> exibicoes;

    public Streaming() {
        this.usuarios = new ArrayList<>();
        this.conteudos = new ArrayList<>();
        this.exibicoes = new ArrayList<>();
    }

    private int contarExibicoesAtivas(Usuario u) {
        int contagem = 0;
        for (Exibicao e : exibicoes) {
            if (e.getUsuario().equals(u)) contagem++;
        }
        return contagem;
    }

    private boolean conteudoJaEstaEmExibicao(Usuario u, Conteudo c) {
        for (Exibicao e : exibicoes) {
            if (e.getUsuario().equals(u) && e.getConteudo().equals(c)) {
                return true;
            }
        }
        return false;
    }

    public void assistirConteudo(Usuario u, Conteudo c) throws StreamingException {
        if (contarExibicoesAtivas(u) >= LimiteExibicoesException.LIMITE) {
            throw new LimiteExibicoesException(u.getNome());
        }

        if (conteudoJaEstaEmExibicao(u, c)) {
            throw new ConteudoEmExibicaoException(c.getTitulo());
        }

        // Se tiver tudo certo - registra a exibição
        exibicoes.add(new Exibicao(c, u, LocalDate.now()));
        IO.println("\nO conteúdo '" + c.getTitulo() + "' está iniciando na conta de " + u.getNome());
    }

    public void finalizarConteudo(Usuario u, Conteudo c) throws ConteudoNaoEmExibicaoException {
        if (!conteudoJaEstaEmExibicao(u, c)) {
            throw new ConteudoNaoEmExibicaoException(c.getTitulo());
        }

        exibicoes.removeIf(e -> e.getUsuario().equals(u) && e.getConteudo().equals(c));
        IO.println("\nO conteúdo '" + c.getTitulo() + "' finalizou na conta de " + u.getNome());
    }
}
