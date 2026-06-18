package ads.poo.exception;

public class LimiteAtingidoException extends AcademiaException {
    public final static int LIMITE = 10;

    public LimiteAtingidoException (String aula) {
        super("A aula '" + aula + "' já atingiu o limite de alunos");
    }
}
