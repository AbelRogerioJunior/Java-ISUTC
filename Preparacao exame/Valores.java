//Importacoes
import java.util.*;

//Classe
public class Valores
{
	//Variavel Global
	public static Scanner ler = new Scanner(System.in);
	
	
	//Metodo Preencher Array em Boolean
	public static boolean [] preencherArrayBoolean(int tamanho)
	{
		boolean [] V = new boolean[tamanho];
		for(int i = 0; i < tamanho;i++)
		{
			System.out.print("Digite o "+(i+1)+" elemento: ");
			int valor = ler.nextInt();
			
			if(valor <= 0)
			{
				V[i] = false;
			}
			else
			{
				V[i] = true;
			}
		}
		return V;
	}
	
	//Metodo Imprimir Array
	public static void imprimirArray(boolean[] V)
	{
		for(int i = 0; i < V.length;i++)
		{
			System.out.println((i+1)+"º = "+V[i]);
		}
	}
	
	//Metodo Main
	public static void main(String [] args)
	{
		System.out.print("Quantos valores quer inserir? ");
		int quant = ler.nextInt();
		boolean [] V = preencherArrayBoolean(quant);
		imprimirArray(V);
	}
}