package aula09;

public class Funcionario {
    private String nome;
    private String numBi;
    private double salario;

    //Contrutor
    public Funcionario(String nome, String numBi, double salario) {
        this.nome = nome;
        this.numBi = numBi;
        this.salario = salario;
    }

    //Metodos
    double bonus(){
        return this.salario * 10/100;
    }


    //getter e Setter
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
