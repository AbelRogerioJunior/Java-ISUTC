package aula09;

public class Vendedor extends Funcionario{
    
    @Override
    double bonus(){
        return salario * 15;
    }
}
