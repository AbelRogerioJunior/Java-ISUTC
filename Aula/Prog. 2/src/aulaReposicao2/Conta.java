package aulaReposicao2;

public abstract class Conta {
    protected String titular;
    protected double saldo;
    public abstract double depositar(double valorDeposito);
    public abstract double sacar(double valorSaque);
    public Conta(String titular, double saldo) {
        this.titular = titular;
        this.saldo = 0;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
}
