package ads.poo;

public class Conta {
    private String titular;
    private String numero; //melhor, pois se a conta iniciar com "0", vai aparecer.
    private double saldo;

    // Construtor
    public Conta(String titular, String numero, double saldo) {
        this.titular = titular;
        this.numero = numero;
        this.saldo = (saldo > 0) ? saldo : 0;
    }

    // depositar
    public void depositar(double valor) {
        this.saldo += (valor > 0) ? valor : 0;
    }

    // sacar
    public void sacar(double valor){
        this.saldo -= (valor > saldo) ? 0 : (valor>0) ? valor : 0;
    }

    // toSring
    public String toString(){
        return String.format(""" 
                Conta: %s
                Titular: %s
                Saldo %.2f
                """, numero, titular, saldo); // """ para
    }

    // Getters
    public String getTitular() {
        return titular;
    }

    public String getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }
}
