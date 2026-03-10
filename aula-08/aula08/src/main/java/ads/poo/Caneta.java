package ads.poo;

public class Caneta {

    private String cor; // "" (padrão inicial)
    private double nivelTinta; // 0.0 (padrão inicial)
    private boolean aberta; // false (padrão inicial)

    public String desenhar(int x1, int y1, int x2, int y2) {
        if (aberta) {
            // calcular a distância
            double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
            // debitar do nível de tinta
            if (nivelTinta >= distancia * 0.01) {
                nivelTinta = nivelTinta - (distancia / 100);
                // retornar a distância percorrida
                // Ex: Desenhei 1cm na cor azul
                return String.format("Desenhei %.2f na cor %s", distancia, cor);
            } else {
                return "A caneta está sem tinta";
            }
        } else {
            return "A caneta está fechada";
        }
    }

    public String getCor() { // obter um valor da classe
        return cor;
    }

    public double getNivelTinta() { // obter um valor da classe
        return nivelTinta;
    }

    public void setCor(String c) { // indicar um valor para a classe
        cor = c;
    }

    public void setNivelTinta(double n) { // indicar um valor para a classe
        nivelTinta = n;
    }

    public boolean abertaFechada() {
        aberta = !aberta;
        return aberta;
    }

    public boolean isAberta() {
        return aberta;
    }
}