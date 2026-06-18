package ads.poo.exceptions;

public class ConteudoEmExibicaoException extends StreamingException {
    public ConteudoEmExibicaoException(String titulo) {
        super("O conteúdo '" + titulo + "' já está em exibição");
    }
}
