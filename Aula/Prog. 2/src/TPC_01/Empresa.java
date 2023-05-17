package TPC_01;

public class Empresa {
    public double calcularFolhaPagamento(Funcionario []listFuncionarios){
        double totPagamento = 0;
        for(int i = 0; i < listFuncionarios.length;i++){
            totPagamento += listFuncionarios[i].calcularPagamento();
        }
        return totPagamento;
    }
}
