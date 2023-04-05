package aula09;

public class Vendedor extends Funcionario{
    
    //Construtor
    public Vendedor(String nome, String numBi, double salario) {
        super(nome, numBi, salario);
    }


    //Metodos
    @Override
    double bonus(){
        return getSalario() * 15/100;
    }
}
