package TPC_01;

public class TesteEmpresa {
    public static void main(String[] args) {
        Gerente g1 = new Gerente("Nilton", 6000);

        Vendedor v1 = new Vendedor("Geraldo", 7000,200);

        Atendente at1= new Atendente("Abel",2000);
        
        Funcionario []listaF = new Funcionario[3];

        Empresa calc = new Empresa();

        listaF[0] = g1;
        listaF[1] = v1;
        listaF[2] = at1;

        listaF[0].calcularPagamento();
        double totalPagamento = calc.calcularFolhaPagamento(listaF);

        System.out.println(listaF[0].calcularPagamento());
        System.out.println(listaF[1].calcularPagamento());
        System.out.println(listaF[2].calcularPagamento());
        System.out.println("Total Pagamento: "+ totalPagamento);
    }
}
