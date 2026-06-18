package ads.poo;

import java.util.ArrayList;

/**
 * BIBLIOTECA - orquestra tudo
 * --> Usa tipo genérico: List<Usuario>, List<Livro>, List<Emprestimo>
 * --> Polimorfismo: emprestar recebe Usuario (Aluno ou Professor)
 * --> throws BibliotecaException: cobre todas as subclasses
 * --> Conta empréstimos ativos pela própria lista (sem lista no Usuario)
 */
public class Biblioteca {
    private ArrayList<Usuario> usuarios;
    private ArrayList<Livro> livros;
    private ArrayList<Emprestimo> emprestimos;

    public Biblioteca() {
        this.usuarios = new ArrayList<>();
        this.livros = new ArrayList<>();
        this.emprestimos = new ArrayList<>();
    }

    public void adicionarUsuario(Usuario u) {
        usuarios.add(u);
    }

    public void adicionarLivro(Livro l) {
        livros.add(l);
    }

    // conta empréstimos ativos de um usuário pela lista de Empréstimos
    private long contarAtivos(Usuario usuario) {
        long count = 0;
        for (Emprestimo e : emprestimos) {
            if(e.getUsuario().equals(usuario)) count++;
        }
        return count;
    }

    // polimorfismo: funciona para Aluno e Professor sem if/else
    public void emprestar(Usuario usuario, Livro livro) throws BibliotecaException {
        if (livro.isEmprestado()) {
            throw new LivroJaEmprestadoException(livro.getTitulo());
        }
        if (contarAtivos(usuario) >= usuario.getLimiteEmprestimos()) {
            throw new LimiteEmprestimosException(usuario.getNome(), usuario.getLimiteEmprestimos());
        }

        livro.setStatus(StatusLivro.EMPRESTADO);
        emprestimos.add(new Emprestimo(usuario, livro));
        IO.println("O usuário " + usuario.getNome() + " pegou '" + livro.getTitulo() + "'");
    }

    public void devolver(Usuario usuario, Livro livro) throws BibliotecaException {
        if (!livro.isEmprestado()) {
            throw new LivroNaoEmprestadoException(livro.getTitulo());
        }

        livro.setStatus(StatusLivro.DISPONIVEL);
        // remove o empréstimo da lista
        emprestimos.removeIf(e -> e.getUsuario().equals(usuario) && e.getLivro().equals(livro));
        IO.println("Livro '" + livro.getTitulo() + "' devolvido pelo usuário " + usuario.getNome());
    }

    public void listarEmprestimos() {
        IO.println("\n---Empréstimos Ativos----");
        if (emprestimos.isEmpty()) {
            IO.println(" (nenhum)");
        } else {
            for (Emprestimo e : emprestimos) {
                IO.println(" " + e);
            }
        }
    }

}
