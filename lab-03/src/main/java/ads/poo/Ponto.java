package ads.poo;

public class Ponto {
    private int x;
    private int y;

    // Constructor
    public Ponto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Getters e Setters
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    // toString
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("(");
        sb.append(" ").append(x);
        sb.append(", ").append(y);
        sb.append(')');
        return sb.toString();
    }

    public double distanciaPonto(Ponto p) {
        return Math.sqrt(Math.pow((p.x - this.x),2) + Math.pow((p.y - this.y),2));
    }

}
