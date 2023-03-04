//Importacoes
import java.util.*;


//Classe
public class Ex04
{
	
	
	
	//Metodo Main
	public static void main(String [] args)
	{
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite se nome: ");
		String nome = teclado.nextLine();
		String invertido = "";
		 for(int i = 0; i < nome.length();i++)
		 {
			 invertido = nome.charAt(i) + invertido;
		 }
		 System.out.print(invertido.toUpperCase());
	}
}