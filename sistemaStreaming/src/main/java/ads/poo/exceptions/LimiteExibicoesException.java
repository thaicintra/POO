package ads.poo.exceptions;

public class LimiteExibicoesException extends StreamingException {
    public static final int LIMITE = 2;

    public LimiteExibicoesException(String nome) {
        super("O usuário '" + nome + "' já atingiu o limite de exibições");
    }
}
