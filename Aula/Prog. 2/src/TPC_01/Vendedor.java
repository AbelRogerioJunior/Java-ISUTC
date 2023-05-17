package TPC_01;

public class Vendedor extends Funcionario{
    private double valorVendas;


    public Vendedor(String nome, double salarioBase, double valorVendas) {
        super(nome, salarioBase);
        this.valorVendas = valorVendas;
    }

    public double calcularPagamento(){
        double pagamento = this.salarioBase + (10/100*getValorVendas()) - (5/100*getSalarioBase());
        
        return pagamento;
    }

    public double getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }
    
    
}
