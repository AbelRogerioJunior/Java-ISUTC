//Importacoes
import java.util.Scanner;



//Programa principal
public class Somaodorr{
	public static void main(String [] Args){
		//Declaracao de classes
		Scanner ler = new Scanner(System.in);
		
		//Leitura do limite
		System.out.print("Quantos valores quer somar? ");
		int limite = ler.nextInt();
		//Somador
		float soma = 0;
		int cont = 0;
		while(cont < limite){
			System.out.print((cont + 1)+ "º numero a somar: ");
			float valor = ler.nextInt();
			soma += valor;
			cont ++;
		}
		System.out.print("A soma dos valores é " + soma);
	}
}