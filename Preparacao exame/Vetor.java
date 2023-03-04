//Importacoes
import java.util.*;


//Classe
public class Vetor
{
	//Metodo Preencher Array
	public static int [] preencherArray()
	{
		Random aleatorio = new Random();
		int [] V = new int[15];
		for(int i = 0; i < 15;i++)
		{
			V[i] = aleatorio.nextInt(5,101);
		}
		return V;
	}
	
	//MetodoImprimir array
	public static void imprimirArray(int []V)
	{
		for(int i = 0; i < V.length;i++)
		{
			if(i < V.length-1)
			{
				if(V[i] == 0)
				{
					System.out.print("");
				}
				else
				{
					System.out.print(V[i]+", ");
				}
			}
			else
			{
				if(V[i] == 0)
				{
					System.out.print("");
				}
				else
				{
					System.out.println(V[i]+". ");
				}
				
			}
		}
	}
	
	//Metodo ordenarDecrescente
	public static void ordenarDecrescente(int [] V)
	{
		
		int aux = 0;
		 for(int i = 0;i < V.length;i++)
		 {
			 for(int j = 0;j < V.length;j++)
			 {
				if(V[i] > V[j])
				{
					aux = V[i];
					V[i] = V[j];
					V[j] = aux;
				}
			 }
		 }
		imprimirArray(V);
	}
	
	
	//Metodo novosArrays
	public static void novosArrays(int [] V)
	{
		int []V1 = new int[V.length];
		int []V2 = new int[V.length];
		for(int i = 0; i < V.length;i++)
		{
			if(V[i] % 5 == 0)
			{
				V1[i] = V[i];
			}
		}
		
		for(int i = 0; i < V.length;i++)
		{
			if(V[i] % 6 == 0)
			{
				V2[i] = V[i];
			}
		}
		System.out.println("Vetor Divisivel por "+ 5);
		ordenarDecrescente(V1);
		System.out.println(" \nVetor Divisivel por "+ 6);
		ordenarDecrescente(V2);
	}
	
	//MetodoMain
	public static void main(String [] args)
	{
		int []V = preencherArray();
		ordenarDecrescente(V);
		novosArrays(V);
	}
}
