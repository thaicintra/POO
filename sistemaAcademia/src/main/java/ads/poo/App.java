package ads.poo;

import ads.poo.exception.AcademiaException;
import ads.poo.exception.JaEstaMatriculadoException;
import ads.poo.exception.LimiteAtingidoException;

public class App {
    public static void main(String[] args) {

        Academia acadimia = new Academia();

        // Criando alunos
        Aluno a1 = new Aluno("Thaíssa", "123.456.789-00");
        Aluno a2 = new Aluno("Edésio", "789.456.123-11");

        // Criando aulas
        Aula musculacao = new Musculacao("Musculação", 60, "Peito");
        Aula cardio = new Cardio("Cardio", 45, Intensidade.INTENSA);

        // Teste 1: Normal
        IO.println("\nTeste 1: Normal");
        try {
            acadimia.realizarMatricula(a1, musculacao);
            acadimia.realizarMatricula(a2, cardio);
            acadimia.listarMatriculas();
        } catch (AcademiaException e) {
            IO.println("Erro: " + e.getMessage());
        }

        // Teste 2: Aluno já matriculado
        IO.println("\nTeste 2: Aluno já matriculado");
        try {
            acadimia.realizarMatricula(a1, musculacao);
        } catch (JaEstaMatriculadoException e) {
            IO.println("Erro: " + e.getMessage());
        } catch (AcademiaException e) {
            IO.println("Erro: " + e.getMessage());
        }

        // Teste 3: Aula lotada
        IO.println("\nTeste 3: Aula lotada");
        try {
            Aula aulaLotada = new Musculacao("Funcional", 50, "Pernas");
            for (int i = 0; i <= 10; i++) {
                acadimia.realizarMatricula(new Aluno("Aluno " + i, "000.000.000-00" + i), aulaLotada);
            }
            acadimia.realizarMatricula(new Aluno("Aluno Extra", "111.111.111-11"), aulaLotada);
        } catch (LimiteAtingidoException e) {
            IO.println("Erro: " + e.getMessage());
        } catch (AcademiaException e) {
            IO.println("Erro: " + e.getMessage());
        }
    }
}
