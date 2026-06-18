package ads.poo;
/**
 * USUARIO - classe abstrata (abstração)
 * --> Não pode ser instanciada diretamente
 * --> Define contrato: todo usuário DEVE ter getLimiteEmprestimos()
 * --> protected: subclasses acessam direto, classes externas não
 */

import java.util.ArrayList;

abstract class Usuario {
    protected String nome;
    protected String cpf;

    public Usuario(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public abstract int getLimiteEmprestimos();

    @Override
    public String toString() {
        return String.format(""" 
                Nome: %s
                CPF: %s""", nome, cpf);
    }
}
