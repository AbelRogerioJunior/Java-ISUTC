package TPC_01;

public class Atendente extends Funcionario{

    

    public Atendente(String nome, double salarioBase) {
        super(nome, salarioBase);
    
    }

    @Override
    public double calcularPagamento() {
        double pagamento = this.salarioBase + 200 - (8/100*this.salarioBase);
        this.setTotPagamento(pagamento);
        return pagamento;
    }
    
}
