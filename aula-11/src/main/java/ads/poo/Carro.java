package ads.poo;

public class Carro {

    private String modelo; //""
    private int velocidadeAtual; //0
    private int velocidadeMaxima; //0

    private static final int VEL_MAX_MODELOS = 300; //constantes -- static significa que só há uma cópia da constante
    private static final int VEL_MIN_MODELOS = 0;

    public Carro(String modelo) {
        this.modelo = modelo;
        this.velocidadeMaxima = VEL_MAX_MODELOS;
        this.velocidadeAtual = 0;
    }

    public Carro(String modelo, int velocidadeMaxima) {
        this.modelo = modelo;
        if (velocidadeMaxima > VEL_MAX_MODELOS) {
            this.velocidadeMaxima = VEL_MAX_MODELOS;
        } else if (velocidadeMaxima < VEL_MIN_MODELOS) {
            this.velocidadeMaxima = VEL_MIN_MODELOS;
        } else {
            this.velocidadeMaxima = velocidadeMaxima;
        }
        this.velocidadeAtual = 0;
    }

    public void acelerar(int i) {
        if (velocidadeAtual + i <= velocidadeMaxima) {
            velocidadeAtual += i;
        } else {
            velocidadeAtual = velocidadeMaxima;
        }
    }

    public void frear(int d) {
        if (velocidadeAtual - d >= VEL_MIN_MODELOS) {
            velocidadeAtual -= d;
        } else {
            velocidadeAtual = VEL_MIN_MODELOS;
        }
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public String getModelo() {
        return modelo;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeAtual(int velocidadeAtual) {
        if (velocidadeAtual >= VEL_MIN_MODELOS && velocidadeAtual <= VEL_MAX_MODELOS) {
            this.velocidadeAtual = velocidadeAtual;
        } else if (velocidadeAtual > velocidadeMaxima) {
            this.velocidadeAtual = velocidadeMaxima;
        } else {
            this.velocidadeAtual = VEL_MIN_MODELOS;
        }
    }
}
