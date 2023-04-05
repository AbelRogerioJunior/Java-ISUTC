package ex01Heranca;

public class Executa {

    public static void main(String[] args) {
        Administradores adm = new Administradores("Abel Junior ", "BI", "928928943", 100000, 4);
        Vendedores nhonguista = new Vendedores("Pedro Da Silva", "Passaporte", "AB0305060", 50000, 10);
        adm.calculaSalario();
        nhonguista.calculaSalario(10000);
        System.out.println(adm.getSalario());
        System.out.println(nhonguista.getSalario());
    }
}
