package aula09;

public class Funcionario {
    private String nome;
    private String numBi;
    protected double salario;


    double bonus(){
        return this.salario * 0.1;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getNumBi() {
        return numBi;
    }


    public void setNumBi(String numBi) {
        this.numBi = numBi;
    }


    public double getSalario() {
        return salario;
    }


    public void setSalario(double salario) {
        this.salario = salario;
    }

}
