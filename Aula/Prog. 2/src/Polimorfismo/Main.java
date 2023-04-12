package Polimorfismo;

public class Main {
    public static void main(String[] args) {
        Mouse mg1 = new Mouse("Desconhecida", 500, "Logicech");

        Mouse mg2= new Mouse("Evetech", 500, "Ryzen");

        Mouse mg3 = new Mouse("Ali express", 500, "Dell");
        
        Livro book01 = new Livro("Minerva", 1000, "Geraldo");

        Livro book02 = new Livro("Papelaria-Rex", 1000, "Celio");


        Produto []carrinho = new Produto[5];
        carrinho[0] = mg1;
        carrinho[1] = mg2;
        carrinho[2] = mg3;
        carrinho[3] = book01;
        carrinho[4] = book02;

        System.out.println(carrinho[0].getDescricao());
    }
}
