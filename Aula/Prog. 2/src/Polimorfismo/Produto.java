package Polimorfismo;

class Produto{
    private String nomeLoja;
    private double preco;
    private String descricao;


    //COntrutor
    public Produto(String nomeLoja, double preco) {
        this.nomeLoja = nomeLoja;
        this.preco = preco;
    }

    //Getters Setters
    public String getNomeLoja() {
        return nomeLoja;
    }


    public void setNomeLoja(String nomeLoja) {
        this.nomeLoja = nomeLoja;
    }


    public double getPreco() {
        return preco;
    }


    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return "Esse e um produto de informatica ";
    }

    @Override
    public String toString() {
        return "Produto [nomeLoja=" + nomeLoja + ", preco=" + preco + ", descricao=" + descricao + "]";
    }
    
    
}