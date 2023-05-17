package aulaReposicao2;

public class ContaCorrente extends Conta {

    public ContaCorrente(String titular, double saldo) {
        super(titular, saldo);
        
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
