package ads.poo;

public class Professor extends Usuario {

    public Professor(String nome, String cpf) {
        super(nome, cpf);
    }

    @Override
    public int getLimiteEmprestimos() {
        return 5;
    }
}
