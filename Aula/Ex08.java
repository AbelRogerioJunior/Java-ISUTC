//Importacao de Biblioteca
import java.util.Scanner;


//Prpgrama Principal
public class Ex08{
	public static void main(String [] Args){
		Scanner Teclado = new Scanner(System.in);
		//Introducao de Valores
		System.out.print("Digite o Primeiro numero: ");
		float X = Teclado.nextFloat();
		System.out.print("Digite o Segundo Valor: ");
		float Y = Teclado.nextFloat();
		
		//Opercoes
		float soma = X + Y;
		float Subtracao = X - Y;
		float Multiplicao = X * Y;
		float Divisao = X / Y;
		
		//Resultado na Tela
		System.out.println("O resultado da Soma e => " + soma);
		System.out.println("O resultado da Subtracao e => " + Subtracao);
		System.out.println("O resultado da Multiplicao e => " + Multiplicao);
		System.out.println("O resultado da Divisao e => " + Divisao);
	}
}