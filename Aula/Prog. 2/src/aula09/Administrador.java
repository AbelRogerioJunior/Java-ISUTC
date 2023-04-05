package aula09;

public class Administrador extends Funcionario{
    
    //Construtor
    public Administrador(String nome, String numBi, double salario) {
        super(nome, numBi, salario);
    }


    //Metodos
    @Override
    double bonus(){
        return getSalario() * 20/100;
    }
}
