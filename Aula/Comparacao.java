//Importacoes
import java.util.Scanner;





//Programa Principal
public class Comparacao{
	public static void main(String [] Args){
		//Leitura dos caracteres
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite uma caractere: ");
		String frase1 = ler.next();
		System.out.print("Digite outro caractere: ");
		String frase2 = ler.next();



		//Verificar se sao iguais
		if(frase1.equals(frase2)){
			System.out.print("Sao iguais");
		}else{
			System.out.print("Nao sao iguais");
		}
	}
}