/*Abel Junior LEIT 11
 * Ex02 Array Bidimensional
 * */

//Importacao
import java.util.Scanner;


//Classe
public class Abel_ArrayBid_02
{
    //Variavel Global
    public static Scanner teclado = new Scanner(System.in);


    //Metodo preencher Matriz
    public static int [][] preencherMatriz(int linhas,int colunas)
    {
        int [][] M = new int[linhas][colunas];

        for(int i = 0; i < linhas;i++)
        {
            for(int j = 0; j < colunas; j++)
            {
                System.out.print("M["+i+"]["+j+"]: ");
                M[i][j] = teclado.nextInt();
            }
        }
        return M;
    }


    //Metodo verificar se sao iguais
    public static void verificar(int[][] M1,int[][] M2)
    {
        int quant = 0;
        for(int i = 0; i< M1.length;i++)
        {
            for(int j = 0; j < M1[i].length;j++)
            {
                if(M1[i][j] != M2[i][j])
                {
                    quant++;
                }
            }
        }

        if(quant > 0)
        {
            System.out.println("As matrizes nao sao iguais com "+ quant +" valores diferentes");
        }
        else
        {
            System.out.println("As Matrizes sao iguais!!!");
        }
    }

    //Metodo Main
    public static void main(String[] args)
    {
        System.out.println("Linhas: ");
        int linhas = teclado.nextInt();
        System.out.println("Colunas");
        int colunas = teclado.nextInt();
        System.out.println("Primeira Matriz");
        int[][]M1 = preencherMatriz(linhas,colunas);
        System.out.println("Segunda Matriz");
        int [][]M2 = preencherMatriz(linhas,colunas);
        verificar(M1,M2);
    }
}
