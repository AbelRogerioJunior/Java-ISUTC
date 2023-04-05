

package AulaAPI;
import java.util.Calendar;
public class Amigo extends Pessoa{

    private Calendar dataAniversario;
    
    public Amigo(String nome, String sexo, int idade) {
        super(nome, sexo, idade);
    }

    //Getters e Setters
    public Calendar getDataAniversario() {
        return dataAniversario;
    }

    public void setDataAniversario(Calendar dataAniversario) {
        this.dataAniversario = dataAniversario;
    }
}
