package aulaReposicao2;

public class ContaPoupanca extends Conta{
    public ContaPoupanca(String titular, double saldo) {
        super(titular, saldo);
        //TODO Auto-generated constructor stub
    }

    @Override
    public double depositar(double valorDeposito) {
        this.setSaldo(this.getSaldo()+ valorDeposito);
        return this.getSaldo();
    }

    @Override
    public double sacar(double valorSaque) {
        this.setSaldo((this.getSaldo() - valorSaque)- (valorSaque / 0.05)) ;
        return this.getSaldo();
    }  
}
