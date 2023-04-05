package Construtor;

public class Funcionarios{
    private String nome;
    private int idade;
    private String sexo;

    public Funcionarios(String nome,int idade, String sexo){
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    //Getter setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    //Detalhe
    public void detalhesFuncionario(){
        System.out.printf("Nome: %s \nIdade: %d \nSexo: %s",this.nome,this.idade,this.sexo);
    }

}