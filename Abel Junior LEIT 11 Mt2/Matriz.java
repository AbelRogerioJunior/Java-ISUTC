
import java.util.*;


public class Matriz
{
	//Variavel Global
	public static Scanner ler = new Scanner(System.in);
	
	//prencher Matriz
	public static int [][] preencherMatriz(int linhas,int colunas)
	{
		int [][]M = new int [linhas][colunas];
		for(int i = 0; i < linhas ; i++)
		{
			for(int j = 0; j < colunas;j++)
			{
				System.out.print("M["+i+"]["+j+"]: ");
				M[i][j]= ler.nextInt();
			}
		}
		return M;
	}
	
	
	
	//Metodo produto diagonalPrincipal
	public static void produtoDiagonalPrincipal(int [][] M)
	{
		int prod = 1;
		for(int i = 0; i < M.length ; i++)
		{
			for(int j = 0; j < M[i].length;j++)
			{
				if(i == j)
				{
					prod = prod * M[i][j];
				}
			}
		}
		System.out.println("Produto da diagonal principal = "+ prod);
	}
	
	//Metodo Produto primeira linhas
	public static void produtoPrimeiraLinha(int [][] M)
	{
		int prod = 1;
		for(int i = 0; i < M.length ; i++)
		{
			for(int j = 0; j < M[i].length;j++)
			{
				if(i == 0)
				{
					prod = prod * M[i][j];
				}
			}
		}
		System.out.println("Produto da primeira linha  = "+ prod);
	}
	
	
	//Metodo soma de toda Matriz
	public static void somaMatriz(int [][] M)
	{
		int soma = 0;
		for(int i = 0; i < M.length ; i++)
		{
			for(int j = 0; j < M[i].length;j++)
			{
				soma= soma + M[i][j];
			}
		}
		System.out.println("Soma de todos elementos da Matriz = "+ soma);
	}
	
	//Soma da primeira colunas
	public static void somaPrimeiraColuna(int [][] M)
	{
		int soma = 0;
		for(int i = 0; i < M.length ; i++)
		{
			for(int j = 0; j < M[i].length;j++)
			{
				if(j == 0)
				{
					soma = soma + M[i][j];
				}
			}
		}
		System.out.println("Soma da primeria coluna da Matriz = "+ soma);
	}
	
	//Metodo que chama todos metodos
	public static void detalhes(int [][]M)
	{
		somaPrimeiraColuna(M);
		produtoPrimeiraLinha(M);
		somaMatriz(M);
		produtoDiagonalPrincipal(M);
	}
	
	//Metodo Main
	public static void main(String [] args)
	{
		System.out.print("Linhas: ");
		int linhas = ler.nextInt();
		System.out.print("Colunas: ");
		int colunas = ler.nextInt();
		int [][]M = preencherMatriz(linhas,colunas);
		detalhes(M);
	}
}