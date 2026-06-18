package ads.poo;

public class Livro {
    private String titulo;
    private String autor;
    private StatusLivro status; // enum - só aceita os 3 valores definidos

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.status = StatusLivro.DISPONIVEL;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public StatusLivro getStatus() {
        return status;
    }


    public boolean isEmprestado() {
        return status == StatusLivro.EMPRESTADO;
    }

    public void setStatus(StatusLivro status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return String.format("""
                Livro: %s
                Autor: %s
                Status: %s""", titulo, autor, status);
    }

}
