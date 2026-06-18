package ads.poo;

public enum Intensidade {
    LEVE("Baixa Intensidade", 30),
    MODERADA("Media Intensidade", 60),
    INTENSA("Alta Intensidade", 90);

    private final String descricao;
    private final int caloriasQueimadas;

    Intensidade(String descricao, int caloriasQueimadas) {
        this.descricao = descricao;
        this.caloriasQueimadas = caloriasQueimadas;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getCaloriasQueimadas() {
        return caloriasQueimadas;
    }
}
