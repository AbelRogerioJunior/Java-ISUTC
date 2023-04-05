package aula09;

public class Executa {


    public static void main(String[] args) {
        ControlaBonus control = new ControlaBonus();
        Vendedor nhoguista = new Vendedor("Geraldo","99999999",2000);
        Funcionario celio = nhoguista;
        
        System.out.println(control.controlaBonus(celio));
    }
}
