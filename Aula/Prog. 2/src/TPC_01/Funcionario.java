package TPC_01;

public class Funcionario implements Pagamento{
    //Atributos
    protected String nome; 
    protected double salarioBase;
    protected double bonus;
    protected double totPagamento;
    protected double desconto;

    
    //Contrutor
    public Funcionario(String nome, double salarioBase) {
            this.nome = nome;
            this.salarioBase = salarioBase;
            this.bonus = 0;
            this.desconto = 0;
        }
        
    

    //Metodos
    public double calcularPagamento(){
        return this.salarioBase;
    }



    //Get & Set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }



    public double getTotPagamento() {
        return totPagamento;
    }

    public void setTotPagamento(double totPagamento) {
        this.totPagamento = totPagamento;
    }
}
