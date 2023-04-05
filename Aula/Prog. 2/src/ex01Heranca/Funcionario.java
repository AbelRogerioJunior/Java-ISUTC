package ex01Heranca;

public class Funcionario {
    private String nome;
    private String tipoDocumento;
    private String numDocumento;

    
    public Funcionario(String nome, String tipoDocumento, String numDocumento) {
        this.nome = nome;
        this.tipoDocumento = tipoDocumento;
        this.numDocumento = numDocumento;
    }

    //Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNumDocumento() {
        return numDocumento;
    }

    public void setNumDocumento(String numDocumento) {
        this.numDocumento = numDocumento;
    } 
}
