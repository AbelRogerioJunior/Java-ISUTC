import java.util.Arrays;
import java.util.Scanner;

public class Tp3
{
    //Variavel glogal
    public static Scanner ler = new Scanner(System.in);

    //Prencher vetor
    public static int [] preencherArray(int n)
    {
        int []V = new int[n];

        for(int i = 0;i<n;i++)
        {
            System.out.print((i+1)+" Valor: ");
            V[i] = ler.nextInt();
        }
        return V;
    }


    public static int [][] preencherMatriz(int n, int m)
    {
        int [][]M = new int [n][m];
         for(int i = 0; i<n;i++)
         {
             for(int j =0;j<m;j++)
             {
                 System.out.println("M ["+(i)+"]["+(j)+"]: ");
                 M[i][j] = ler.nextInt();
             }
         }
        return M;
    }

    //Soma dos elementos da matriz
    public static int somaMatriz(int [][] M)
    {
        int soma = 0;
        for(int i = 0; i< M.length;i++)
        {
            for(int j = 0; j< M[i].length;j++)
            {
                soma += M[i][j];
            }
        }
        return soma;
    }

    //Media Matriz
    public static double mediaMatriz(int [][] M)
    {
        int soma = somaMatriz(M);
        double media = soma / (M.length*M[0].length);
        return media;
    }

    //Valores Maiores que a media
    public static void maiorMediaMatriz(int [][] M)
    {
        double media = mediaMatriz(M);

        for(int i = 0; i<M.length;i++)
        {
            for(int j =0; j < M[i].length;j++)
            {
                if(M[i][j] > media)
                {
                    System.out.println(M[i][j]+" e maior que a media que e "+ media);
                }
            }
        }
    }

    //Contruir novo vetor
    public static int [] vetorPares(int [] V)
    {
        int contar =0;
        for(int i = 1; i < V.length;i++)
        {
            if(i % 2 ==0)
            {
                contar++;
            }
        }
        int [] A = new int[contar];


        for(int j = 1; j< V.length;j++)
        {
            if(j % 2 == 0)
            {
                A[j] = V[j];
            }
        }
        return A;
    }

    //Imprimir vetor
    public static void imprimirVetor(int [] A)
    {
        System.out.println(Arrays.toString(A));
    }

    //Metodo main
    public static void main(String[] args)
    {
        System.out.println("Qual tamanho do vetor? ");
        int tamVet = ler.nextInt();
        int [] A = preencherArray(tamVet);

        System.out.println("Digite o numero das linhas da Matriz: ");
        int tamLinhas = ler.nextInt();
        System.out.println("Digite o numero das colunas da Matriz: ");
        int tamColunas = ler.nextInt();
        int [][]M = preencherMatriz(tamLinhas,tamColunas);
        maiorMediaMatriz(M);
        imprimirVetor(A);
    }
}
