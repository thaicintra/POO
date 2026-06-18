package ads.poo;

import ads.poo.exception.AcademiaException;
import ads.poo.exception.JaEstaMatriculadoException;
import ads.poo.exception.LimiteAtingidoException;
import ads.poo.exception.NaoEstaMatriculadoException;

import java.time.LocalDate;
import java.util.ArrayList;

public class Academia {
    private ArrayList<Aluno> alunos;
    private ArrayList<Matricula> matriculas;
    private ArrayList<Aula> aulas;

    public Academia() {
        this.alunos = new ArrayList<>();
        this.matriculas = new ArrayList<>();
        this.aulas = new ArrayList<>();
    }

    public int quantidadeAlunoMatriculado(Aula a) {
        int contagem = 0;
        for (Matricula m : matriculas) {
            if (m.getAula().equals(a)) {
                contagem++;
            }
        }
        return contagem;
    }

    public boolean alunoJaEstaMatriculado(Aluno al, Aula a) {
        for (Matricula m : matriculas) {
            if (m.getAluno().equals(al) && m.getAula().equals(a)) {
                return true;
            }
        }
        return false;
    }

    public void realizarMatricula(Aluno al, Aula a) throws AcademiaException {
        if (quantidadeAlunoMatriculado(a) >= LimiteAtingidoException.LIMITE) {
            throw new LimiteAtingidoException(a.getAula());
        }
        if (alunoJaEstaMatriculado(al, a)) {
            throw new JaEstaMatriculadoException(al.getNome(), a.getAula());
        }

        matriculas.add(new Matricula(al, a, LocalDate.now()));
        IO.println("O aluno " + al.getNome() + " foi matriculado na aula " + a.getAula());
    }

    public void cancelarMatricula(Aluno al, Aula a) throws AcademiaException {
        if (!alunoJaEstaMatriculado(al, a)) {
            throw new NaoEstaMatriculadoException(al.getNome(), a.getAula());
        }

        matriculas.removeIf(e -> e.getAluno().equals(al) && e.getAula().equals(a));
        IO.println("Aluno " + al.getNome() + " foi desmatriculado da aula " + a.getAula());
    }

    public void listarMatriculas() {
        for (Matricula m : matriculas) {
            IO.println(m);
        }
    }
}
