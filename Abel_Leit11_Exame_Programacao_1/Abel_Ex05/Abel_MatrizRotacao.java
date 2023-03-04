//Nome: Abel Rogerio Mandlate Junior lEIT_11


//Importacoes
import java.util.*;


//Classe
public class Abel_MatrizRotacao
{
	//Variavel Global
	public static Scanner ler = new Scanner(System.in);
	
	
	
	//Metodo Preencher Matriz
	public static int[][] preencherMatriz(int linhas, int colunas)
	{
		int [][] M = new int [linhas][colunas];
		for(int i = 0; i < linhas;i++)
		{
			for(int j = 0; j < colunas;j++)
			{
				System.out.print("M["+i+"]["+j+"]: ");
				M[i][j] = ler.nextInt();
			}
		}
		return M;
	}
	
	//Metodo imprimir matriz
	public static void imprimirMatriz(int [][]M)
	{
		for(int i = 0; i < M.length;i++)
		{
			for(int j = 0; j < M[i].length;j++)
			{
				System.out.print("["+M[i][j]+"]");
			}
			System.out.println();
		}
	}
	
	//Metodo Rodar Matriz
	public static void rodarMatriz(int [][]M)
	{
		int [][]MR = new int[M[0].length][M.length];
		
		for(int i = 0; i < M[0].length;i++)
		{
			for(int j = 0; j < M.length;j++)
			{
				MR[i][j] = M[j][i];
			}
		}
		
		System.out.println("Matriz original");
		imprimirMatriz(M);
		System.out.println("Matriz Rotacionada");
		imprimirMatriz(MR);
	}
	
	//Metodo Main
	public static void main(String [] ars)
	{
		System.out.print("Linhas: ");
		int linhas = ler.nextInt();
		System.out.print("Colunas: ");
		int colunas = ler.nextInt();
		int [][]M = preencherMatriz(linhas,colunas);
		rodarMatriz(M);
	}
}