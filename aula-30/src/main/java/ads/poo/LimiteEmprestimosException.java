package ads.poo;

public class LimiteEmprestimosException extends BibliotecaException {

    public LimiteEmprestimosException (String nome, int limite) {
        super("Usuário '" + nome + "' atingiu o limite de " + limite + " empréstimos.");
    }
}
