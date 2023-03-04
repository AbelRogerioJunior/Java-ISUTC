//Importacoes
import java.util.Scanner;



//Programacao
public class Notas{
public static void main(String [] Args){
	//Declaracao class Scanner
	Scanner ler = new Scanner(System.in);
	
	
	//Leitura dos dados
	System.out.print("Teste 1: " );
	Double teste1 = ler.nextDouble();
	System.out.print("Teste 2: " );
	Double teste2 = ler.nextDouble();
	System.out.print("TPC 1: " );
	Double tpc1 = ler.nextDouble();
	System.out.print("TPC 2: " );
	Double tpc2 = ler.nextDouble();
	String situacao="";
	
	
	//Nota Frequecia
	double notaf = (0.5 *((teste1+teste2)/2)) + (0.5 *(tpc1+tpc2)/2);
	
	
	//Ver Situacao
	if(notaf >=10){
		situacao = "foi Aprovado";
		}else {
			situacao = "foi Reprovado";
		}
		System.out.print("O aluno teve nota frequencia "+ notaf +" e ele "+ situacao);
	}
}	