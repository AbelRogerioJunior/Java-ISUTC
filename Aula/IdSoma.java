//Importacao
import java.util.Scanner;



//Programa Principal
public class IdSoma{
	public static void main(String [] Args){
		do{
			//Leitura de Dados
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite o numero: ");
		int Nr = teclado.nextInt();
		
		//Achar somadores
		int soma = 0;
		for(int cont = 0;cont <=Nr;cont ++){
			soma +=cont;
			if(cont == Nr){
				System.out.print(cont + " = " + soma);
			}else{
				System.out.print(cont + " + ");
			}
		}
			//Resposta
			System.out.print("Quer continuar? [S/N] ");
			char resp = teclado.nextChar();
		}while((resp == "s") || (resp == "S"));
	}
}