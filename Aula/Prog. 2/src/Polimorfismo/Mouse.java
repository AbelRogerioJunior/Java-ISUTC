package Polimorfismo;

public class Mouse extends Produto{
    private String tipo;


    //Contrutor
    public Mouse(String nomeLoja, double preco, String tipo) {
        super(nomeLoja, preco);
        this.tipo = tipo;
    }

    //Getters and Setters
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String getDescricao(){
        return getDescricao() + this.tipo;
    }

    @Override
    public String toString() {
        return "Mouse [tipo=" + tipo + "]";
    }
    
    
}
