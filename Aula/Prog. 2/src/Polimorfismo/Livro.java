package Polimorfismo;

public class Livro extends Produto {
    private String autor;


    //Contrutor
    public Livro(String nomeLoja, double preco, String autor) {
        super(nomeLoja, preco);
        this.autor = autor;
    }

    //Get & Set
    public String getAutor() {
        return autor;
    }

    
    


    public void setAutor(String autor) {
        this.autor = autor;
    }
}
