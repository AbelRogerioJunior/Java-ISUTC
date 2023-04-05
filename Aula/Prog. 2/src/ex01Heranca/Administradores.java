package ex01Heranca;

public class Administradores extends Funcionario{
    //Atributos
    private double salario;
    private int horasExtra;


    //Contrutor
    public Administradores(String nome, String tipoDocumento, String numDocumento, double salario, int horas) {
        super(nome, tipoDocumento, numDocumento);
        this.salario = salario;
        this.horasExtra = horas;
    }
    //Metodo

    public void calculaSalario(){
        this.salario = salario + (salario/100*horasExtra);
    }

    //Getters e Setters
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getHorasExtra() {
        return horasExtra;
    }

    public void setHorasExtra(int horasExtra) {
        this.horasExtra = horasExtra;
    }
    
}