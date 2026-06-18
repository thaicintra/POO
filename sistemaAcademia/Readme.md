[//]: # (🏋️ Sistema de Academia)

[//]: # (Enunciado:)

[//]: # (Uma academia oferece diferentes tipos de aulas para seus alunos. Cada aula tem um nome e uma duração em minutos. Aulas de musculação têm um grupo muscular alvo &#40;ex: "peito", "costas"&#41;. Aulas de cardio têm uma intensidade, representada por um nível que pode ser leve, moderada ou intensa.)

[//]: # (A academia mantém uma lista de alunos, aulas e matrículas. Uma matrícula registra qual aluno está inscrito em qual aula e em que data.)

[//]: # (O sistema deve permitir que um aluno se matricule em uma aula, listar todas as matrículas e cancelar uma matrícula. O sistema deve lançar exceções quando um aluno tentar se matricular duas vezes na mesma aula, ou quando uma aula já tiver atingido o limite de 10 alunos matriculados.)

[//]: # (Todo tipo de aula deve ser capaz de fornecer uma descrição textual de seus detalhes.)

```mermaid
classDiagram
    direction TB
    
    class App {
        
    }
    
    class Academia {
        - alunos: ArrayList~Aluno~
        - matriculas: ArrayList~Matricula~ 
        - aulas: ArrayList~Aula~
        + realizarMatricula(Aluno al, Aula a) void
        + cancelarMatricula(Aluno al, Aula a) void
        + listarMatriculas() void
        
    }
    
    class Matricula {
        - alunos: Aluno
        - aulas: Aula
        - data: LocalDate
    }
    
    class Aluno {
        - nome: String
        - cpf: String
    }
    
    class Aula {
        <<abstract>>
        # nome: String
        # duracaoEmMinutos: int
    }
    
    class Musculacao {
        - grupoMuscular: String
    }
    
    class Cardio {
        - intensidade: Intensidade
    }
    
    class Descritivel {
        <<interface>>
        + getDescricao() String
    }
    
    class Intensidade {
        <<enumeration>>
        LEVE
        MODERADA
        INTENSA
    }
    
    class AcademiaException {
        <<exception>>
    }
    
    class JaEstaMatriculadoException {
        <<exception>>
    }
    
    class LimiteAtingidoException {
        <<exception>>
    }
    
    App <.. Academia
    Academia <.. "throws" AcademiaException
    Academia o-- Aula
    Academia o-- Aluno
    Academia *-- Matricula
    Aula <|-- Musculacao
    Aula <|-- Cardio
    Cardio <.. Intensidade
    Cardio ..|> Descritivel
    Musculacao ..|> Descritivel
    AcademiaException <|-- JaEstaMatriculadoException
    AcademiaException <|-- LimiteAtingidoException
```