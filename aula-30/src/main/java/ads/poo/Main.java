package ads.poo;

/**
 * MAIN - testa tudo com try-catch obrigatório (checked)
 * --> Catch mais específico SEMPRE antes do mais genérico
 */
public class Main {
    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca();

        // polimorfismo: Aluno e Professor tratados como Usuário
        Usuario ana = new Aluno("Ana", "111.222.333-44");
        Usuario joao = new Professor("João", "222.333.444-55");

        Livro clean = new Livro("Clean Code", "Aaaa");
        Livro java  = new Livro("Java Efetivo", "Bbbb");
        Livro ddd   = new Livro("Domain-Driven Design", "Cccc");
        Livro tdd   = new Livro("TDD by Example", "Dddd");
        Livro refact = new Livro("Refactoring", "Eeee");
        Livro patterns = new Livro("Design Patterns", "Ffff");

        biblioteca.adicionarUsuario(ana);
        biblioteca.adicionarUsuario(joao);
        biblioteca.adicionarLivro(clean);
        biblioteca.adicionarLivro(java);
        biblioteca.adicionarLivro(ddd);
        biblioteca.adicionarLivro(tdd);
        biblioteca.adicionarLivro(refact);
        biblioteca.adicionarLivro(patterns);

        // TESTE 1: Fluxo Normal
        IO.println("\n=== TESTE 1: Empréstimos Normais ===");
        try {
            biblioteca.emprestar(ana, clean);   // Aluno: limite 3
            biblioteca.emprestar(ana, java);
            biblioteca.emprestar(ana, ddd);
            biblioteca.emprestar(joao, tdd);    // Professor: limite 5
            biblioteca.emprestar(joao, refact);
        } catch (BibliotecaException e) {
            IO.println("ERRO: " + e.getMessage());
        }
        biblioteca.listarEmprestimos();

        // TESTE 2: Livro já emprestado
        IO.println("\n=== TESTE 2: Livro já Emprestado ===");
        try {
            biblioteca.emprestar(joao, clean);
        } catch (BibliotecaException e) {
            IO.println("ERRO: " + e.getMessage());
        }

        // TESTE 3: Limite atingido (Aluno = 3)
        IO.println("\n=== TESTE 3: Limite Atingido ===");
        try {
            biblioteca.emprestar(ana, patterns); // Ana já tem 3
        } catch (LimiteEmprestimosException e) {
            IO.println("ERRO: " + e.getMessage());
        } catch (BibliotecaException e) {
            IO.println("ERRO: " + e.getMessage());
        }

        // TESTE 4: Devolução Inválida
        IO.println("\n=== TESTE 4: Devolução Inválida ===");
        try {
            biblioteca.devolver(ana, patterns);
        } catch (LivroNaoEmprestadoException e) {
            IO.println("ERRO: " + e.getMessage());
        } catch (BibliotecaException e) {
            IO.println("ERRO: " + e.getMessage());
        }

        // TESTE 5: Devolução e re-empréstimo
        IO.println("\n=== TESTE 5: Devolução e re-empréstimo ===");
        try {
            biblioteca.devolver(ana, clean);
            biblioteca.emprestar(joao, clean);
        } catch (BibliotecaException e) {
            IO.println("ERRO: " + e.getMessage());
        }

        // TESTE 6: Polimorfismo - Professor tem limite maior
        IO.println("\n=== TESTE 6: Polimorfismo - Professor (limite 5) ===");
        try {
            biblioteca.emprestar(joao, patterns);
        } catch (BibliotecaException e) {
            IO.println("ERRO: " + e.getMessage());
        }

     biblioteca.listarEmprestimos();

    }
}
