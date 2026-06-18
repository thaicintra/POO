package ads.poo;

import ads.poo.exceptions.ConteudoEmExibicaoException;
import ads.poo.exceptions.LimiteExibicoesException;
import ads.poo.exceptions.StreamingException;

public class App {
    static void main() {

        // Instanciando plataforma
        Streaming thaiiflix = new Streaming();

        // Criando usuários
        Usuario u1 = new Usuario("Thaíssa", "123.456.789-00");
        Usuario u2 = new Usuario("Edésio", "789.456.123-11");

        // Criando conteúdo
        Conteudo filme1 = new Filme("Inception", 148, "Christopher Nolan");
        Conteudo filme2 = new Filme("Inglourious Basterds", 153, "Quentin Tarantino");
        Conteudo serie1 = new Serie("Downton Abbey", 90,52);

        // Teste 1: Normal
        IO.println("\nTeste 1: Normal");
        try {
            thaiiflix.assistirConteudo(u1, serie1);
            thaiiflix.assistirConteudo(u2, filme2);
        } catch (StreamingException e) {
            IO.println("Erro: " + e.getMessage());
        }

        // Teste 2: conteúdo já em exibição
        IO.println("\nTeste 2: conteúdo já em exibição");
        try {
            thaiiflix.assistirConteudo(u2, filme2);
        } catch (ConteudoEmExibicaoException e) {
            IO.println("Erro: " + e.getMessage());
        } catch (StreamingException e) {
            IO.println("Erro: " + e.getMessage());
        }

        // Teste 3: limite de exibições
        IO.println("\nTeste 3: limite de exibições");
        try {
            thaiiflix.assistirConteudo(u1, filme1);
            thaiiflix.assistirConteudo(u1, filme2);
            thaiiflix.assistirConteudo(u1, serie1);
        } catch (LimiteExibicoesException e) {
            IO.println("Erro: " + e.getMessage());
        } catch (StreamingException e) {
            IO.println("Erro: " + e.getMessage());
        }

        // Teste 4: finalizando um conteúdo e assistindo novamente
        IO.println("\nTeste 4: finalizando um conteúdo e assistindo novamente");
        try {
            thaiiflix.finalizarConteudo(u1, filme1);
            thaiiflix.assistirConteudo(u1, filme2);
        } catch (StreamingException e) {
            IO.println("Erro: " + e.getMessage());
        }
    }
}
