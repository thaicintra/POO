package ads.poo;

public class LivroJaEmprestadoException extends BibliotecaException {
    public LivroJaEmprestadoException (String titulo) {
        super("O livro '" + titulo + "' já está emprestado");
    }
}
