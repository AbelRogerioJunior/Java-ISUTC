package aula09;

public class Administrador extends Funcionario{
    
    @Override
    double bonus(){
        return salario * 20/100;
    }
}
