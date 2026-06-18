package ads.poo;

public class LivroNaoEmprestadoException extends BibliotecaException {
    public LivroNaoEmprestadoException (String titulo){
        super("O livro '" + titulo + "' não está emprestado");
    }

}
