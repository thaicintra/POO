package ads.poo;

public class Lampada {

    // Atributos
    private boolean ligada;

    // Métodos
    public boolean isLigada() {
        return ligada;
    }

    boolean ligarDesligar() {
        ligada = !ligada;
        return ligada;
    }
}

