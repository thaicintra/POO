package ads.poo;

public class Aluno extends Usuario {

    public Aluno(String nome, String cpf) {
        super(nome, cpf);
    }

    @Override
    public int getLimiteEmprestimos() {
        return 3;
    }
}
