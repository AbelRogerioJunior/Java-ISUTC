package ex04;

public class Velho extends Imovel{
    private double desconto;

    public void imprimeDesconto(){
        System.out.println(this.desconto);
    }

    //Getter and setter
    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }
    

}
