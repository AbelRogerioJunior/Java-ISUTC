package VideoClube;

public class DVD {
    private int id;
    private String nome;
    private String genero;
    private String dataLancemento;

    

    //Construtor
    public DVD(int id, String nome, String genero, String dataLancemento) {
        this.id = id;
        this.nome = nome;
        this.genero = genero;
        this.dataLancemento = dataLancemento;
    }

    //Metodos
    

    //Gets Sets
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public String getDataLancemento() {
        return dataLancemento;
    }
    public void setDataLancemento(String dataLancemento) {
        this.dataLancemento = dataLancemento;
    }

    @Override
    public String toString() {
        return "DVD [id=" + id + ", nome=" + nome + ", Genero=" + genero + ", dataLancemento=" + dataLancemento + "]\n";
    }
    

    
}
