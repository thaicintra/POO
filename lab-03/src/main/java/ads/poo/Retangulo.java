package ads.poo;

public class Retangulo {

    private int altura;
    private int largura;
    private String codificacao;

    public Retangulo() {
        this.altura = 3;
        this.largura = 4;
        this.codificacao = "ASCII";
    }

    public Retangulo (int altura, int largura, String codificacao) {
        this();
        if (altura > 0 && largura > 0) {
            this.altura = altura;
            this.largura = largura;
        }

        this.codificacao = codificacao.equalsIgnoreCase("UTF-8") ? codificacao : "ASCII";
    }
    public boolean setAltura(int altura) {
        if (altura > 0 && largura > 0) {
            this.altura = altura;
            return true;
        } else {
            return false;
        }
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }

    public int getAltura() {
        return altura;
    }

    public int getLargura() {
        return largura;
    }

    public int getArea() {
        return altura * largura;
    }

    public int getPerimetro() {
        return 2*altura + 2*largura;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        String top = "+" + "-".repeat(largura) + "+\n";
        sb.append(top);
        String miolo = "|" + " ".repeat(largura) + "|\n";
        sb.append(miolo.repeat(altura));
        String bottom = "+" + "-".repeat(largura) + "+\n";
        sb.append(bottom);
        return sb.toString();
    }
}



