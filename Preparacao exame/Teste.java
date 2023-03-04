import java.util.*;


//Classe
public class Teste
{
	//Variavel Global
	public static Scanner ler = new Scanner(System.in);
	
	
	//Preencher Matriz
	public static  int [][]preencherMatriz(int ordem)
	{
		int[][]M = new int[ordem][ordem];
		for(int i = 0; i < ordem;i++)
		{
			for(int j = 0; j < ordem;j++)
			{
				System.out.print("M["+i+"]["+j+"]");
				M[i][j] = ler.nextInt();
			}
		}
		return M;
	}
	
	//Imprimir Matriz
	public static void imprimirMatriz(int [][]M)
	{
		for(int i = 0; i < M.length;i++)
		{
			for(int j = 0; j < M[i].length;j++)
			{
				System.out.printf("[%d]",M[i][j]);
			}
			System.out.println();
		}
	}
	
	
	//Metodo soma dos elementos da diagonal principal
	public static void somaPrincipal(int [][]M)
	{
		int soma = 0;
		for(int i = 0; i < M.length;i++)
		{
			for(int j = 0; j < M[i].length;j++)
			{
				if(i == j)
				{
					soma += M[i][j];
				}
			}
		}
		System.out.printf("A soma dos elementos da diagonal principal e %d", soma);
		System.out.println();
	}
	
	//Soma diagonal Secundaria
	public static void somaSecundaria(int [][]M)
	{
		int cont = 0;
		int soma = 0;
		for(int i = 0; i < M.length;i++)
		{
			for(int j = 0; j < M[i].length;j++)
			{
				if(j == (M[i].length-1)-cont)
				{
					soma+=M[i][j];
				}
			}
			cont++;
		}
		System.out.printf("A soma dos elementos da diagonal Secundaria e %d", soma);
		System.out.println();
	}
	
	//Metodo que chama todos outros metodos
	public static void detalhesMatriz(int[][] M)
	{
		imprimirMatriz(M);
		somaPrincipal(M);
		somaSecundaria(M);
	}
	
	//Metodo Main
	public static void main(String [] args)
	{
		System.out.print("Qual e ordem da matriz: ");
		int ordem = ler.nextInt();
		int [][]M = preencherMatriz(ordem);
		detalhesMatriz(M);
	}
}