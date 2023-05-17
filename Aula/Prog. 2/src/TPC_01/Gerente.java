package TPC_01;

public class Gerente extends Funcionario{
        

    public Gerente(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularPagamento(){
        double pagamento = this.salarioBase + (20/100*getSalarioBase()) - (10/100*getSalarioBase());
        this.setTotPagamento(pagamento);
        return pagamento;
    }
}
