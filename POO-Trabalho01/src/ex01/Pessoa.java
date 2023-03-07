package ex01;

public class Pessoa{
    int id;
    String nome;
    int idade;
    int quantAniversario;

    public void completarAnos(){
        idade+=quantAniversario;
    }

    public Pessoa(int id, String nome, int idade,int quantAniversario){
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.quantAniversario= quantAniversario;
    }

   public void detalhes(){
        System.out.printf("Id ==> %d \nNome ==> %s \nIdade ==> %d \nQuant. Aniversarios ==> %d",id,nome,idade,quantAniversario);
   }
}

