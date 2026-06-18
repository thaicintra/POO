package ads.poo.exceptions;


public class ConteudoNaoEmExibicaoException extends StreamingException {
    public ConteudoNaoEmExibicaoException (String titulo) {
        super("O conteúdo '" + titulo + "' não está em exibição");
    }
}
