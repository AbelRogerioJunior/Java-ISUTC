package ex01Heranca;

public class Vendedores extends Funcionario{
    private double salario;
    private double comissaoVenda;

    //Contrutor
    public Vendedores(String nome, String tipoDocumento, String numDocumento, double salario, double comissaoVenda) {
        super(nome, tipoDocumento, numDocumento);
        this.salario = salario;
        this.comissaoVenda = comissaoVenda;
    }

    //Metodos
    public void calculaSalario(double valorVendas){
        this.salario = salario + (comissaoVenda/100*valorVendas);
    }


    //Getters e Setters
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public double getComissaoVenda() {
        return comissaoVenda;
    }
    public void setComissaoVenda(double comissaoVenda) {
        this.comissaoVenda = comissaoVenda;
    }
}
