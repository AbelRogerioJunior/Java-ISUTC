//IMportacoes
import java.util.*;

//Classe
public class TrianguloDePascal
{
	//Variavel Global
	public static Scanner ler = new Scanner(System.in);
	
	//Preencher primeira linha
	public static int [][] preencherPorUm(int termos)
	{
		int [][] V = new int[termos][termos];
		for(int i = 0; i < V.length;i++)
		{
			for(int j = 0; j < V[i].length;j++)
			{
				if(i == j || j==0)
				{
					V[i][j] = 1;
				}
				else
				{
					V[i][j] = 0;
				}
				
				if((i > 1) && ((j>0) && (j<i)))
				{
					V[i][j] = V[i-1][j] + V[i-1][j-1];
				}
			}
		}
		return V;
	}
	
	//imprimir matriz
	public static void imprimirTriangulo(int [][] T)
	{
		for(int i = 0; i < T.length;i++)
		{
			for(int j = 0; j < T[i].length;j++)
			{
				if(T[i][j] != 0)
				{
					System.out.print("["+T[i][j]+"]");
				}
				else
				{
					System.out.print("");
				}
			}
			System.out.println();
		}
		
	}
	
	//Triangulo de Pascal
	public static void trianguloDePascal(int termos)
	{
		int [][]  triangulo = preencherPorUm(termos);
		imprimirTriangulo(triangulo);
		
	}
	
	//MetodoMain
	public static void main(String [] args)
	{
		System.out.print("Digite o numero de termos: ");
		int termos = ler.nextInt();
		trianguloDePascal(termos);
	}
}