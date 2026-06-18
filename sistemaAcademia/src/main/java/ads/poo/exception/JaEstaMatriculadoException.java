package ads.poo.exception;

public class JaEstaMatriculadoException extends AcademiaException {

    public JaEstaMatriculadoException (String nome, String aula) {
        super("O aluno " + nome + " já está matriculado na aula " + aula);
    }
}

