//Importacao de Bibliotecas
import java.util.Scanner;


//Programa Principal
public class Ex10{
	public static void main(String [] Args){
		//Leitura das notas
		Scanner Teclado = new Scanner(System.in);
		String nome = Teclado.nextLine();
		System.out.print("Digite a Primeira Nota: ");
		float nota1 = Teclado.nextFloat();
		System.out.print("Digite a Segunda Nota: ");
		float nota2 = Teclado.nextFloat();
		System.out.print("Digite a Terceira Nota: ");
		float nota3 = Teclado.nextFloat();
		float Media = (nota1 + nota2 + nota3)/3;
		String situacao = "";
		
		
		//Verificacao de Situacao
		if (Media < 10){
			situacao = "foi REPROVADO!";
		} else if ((Media >= 10) && (Media < 14)){
			situacao = "vai ao exame!";
		} else{
			situacao = "foi APROVADO!";
		}
		
		//Resultado na Tela
		System.out.println("Seu nome e " + nome);
		System.out.println("A media desse aluno e " + Media + " e ele " + situacao);
		System.out.print("<<FIM DO PROGRAMA!!!>>");
	}
}