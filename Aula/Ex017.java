public class Ex017 {
    public static void main(String[] args) {
        //Declaracao de dados
        double A = 80000;
        double TaxaA = A*0.03;
        double B = 200000;
        double TaxaB = B*0.015;

        //Calculo dos anos
        int anos = 0;
        while(A < B){
            A +=TaxaA;
            B +=TaxaB;
            anos ++;
        }

        //Resultado na Tela
        System.out.print("Serao necessarios "+anos+" anos para que A seja maior ou igual a B");
    }
}
