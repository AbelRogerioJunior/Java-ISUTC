package aulaReposicao;



public abstract class Veiculo{
    protected double velocidade;
    
    
    public abstract double acelerar();
    public abstract double frear();
    public double getVelocidade() {
        return velocidade;
    }
    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }
    
    public Veiculo(double velocidade) {
        this.velocidade = velocidade;
        
    }
}