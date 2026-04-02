package ads.poo;

public class Pessoa {

    private String nome;
    private String cpf;
    private String email;

    // Constructor
    public Pessoa(String nome, String cpf, String email) { //botão direito + generate + constructor
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }

    // To Sring
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();

        sb.append("Nome: ").append(nome).append('\n');
        sb.append("CPF: ").append(cpf).append('\n');
        sb.append("Email: ").append(email).append('\n');

        return sb.toString();
    }

    // Getter/Setter
    public String getNome() { //botão direito + generate + setter getter
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome; //this. se refere à pessoa criada no main.
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
