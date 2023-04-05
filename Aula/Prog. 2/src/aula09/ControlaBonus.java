package aula09;

public class ControlaBonus {
    private double totalBonus;

    //Contrutor
    public ControlaBonus(){
        this.totalBonus = 0;
    }


    //Metodos 
    double controlaBonus(Funcionario f){
        totalBonus +=  f.bonus();
        return totalBonus;
    }


    //Getter e Setters
    public double getTotalBonus() {
        return totalBonus;
    }

    public void setTotalBonus(double totalBonus) {
        this.totalBonus = totalBonus;
    }
}
