//Impotacao de Bibliotecas
import java.util.Scanner;

//Programa Principal
public class Ex11{
	public static void main(String [] Args){
		Scanner Teclado = new Scanner(System.in);
		System.out.print("Digite a Primeira Nota: ");
		float nota1 = Teclado.nextFloat();
		System.out.print("Digite a Segunda Nota: ");
		float nota2 = Teclado.nextFloat();
		System.out.print("Digite a Terceira Nota: ");
		float nota3 = Teclado.nextFloat();
		float maior = 0;
		
		//Verificacao do maior
		if ((nota1 > nota2) && (nota2 > nota3)){
			maior = nota1;
		} else if ((nota2 > nota1) && (nota1 > nota3)){
			maior = nota2;
		}else if ((nota3 > nota1) && (nota1 > nota2)){
			maior = nota3;
		}
		
		//Resultado na Tela
		System.out.println("A maior nota e " + maior);
		System.out.print("<<FIM PROGRAMA!!!>>");
	}
}