package ads.poo;

import java.time.LocalDate;

public class Matricula {
    private Aluno aluno;
    private Aula aula;
    private LocalDate data;

    public Matricula(Aluno aluno, Aula aula, LocalDate data) {
        this.aluno = aluno;
        this.aula = aula;
        this.data = data;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public Aula getAula() {
        return aula;
    }

    public String toString() {
        return String.format("""
                Aluno: %s  
                Aula: %s  
                Data: %s""",
                aluno.getNome(),
                aula.getAula(),
                data);
    }
}
