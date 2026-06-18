package ads.poo.exception;

public class NaoEstaMatriculadoException extends AcademiaException {
    public NaoEstaMatriculadoException(String nome, String aula) {
        super("O aluno '" + nome + "' não está matriculado na aula " + aula);
    }
}
