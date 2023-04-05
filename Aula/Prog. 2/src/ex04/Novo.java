package ex04;

public class Novo extends Imovel{
    private double adicional;

    public void impressaoAdd(){
         System.out.println(this.adicional);
    }

    public double getAdicional() {
        return adicional;
    }

    public void setAdicional(double adicional) {
        this.adicional = adicional;
    }
    
}
