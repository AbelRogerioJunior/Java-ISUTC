/*Abel Junior LEIT 11
 * Ex01 Array Bidimensional
 * */

import java.util.Scanner;

public class Abel_ArrayBid_01 {

    //Variavel Global
    public static Scanner teclado = new Scanner(System.in);


    //Metodo preencher Matriz
    public static int [][] preencherMatriz(int ordem)
    {
        int [][]M = new int[ordem][ordem];
        for(int i =0; i < ordem;i++)
        {
            for(int j = 0; j< ordem;j++)
            {
                System.out.print("M["+i+"]"+"["+j+"] = ");
                M[i][j] = teclado.nextInt();
            }
        }
        return M;
    }

    //Metodo para verificar os elemetos da matriz e dar valor logico
    public static boolean [][] verificar(int [][] A)
    {
        boolean [][]teste = new boolean[A.length][A[0].length];

        for(int i = 0; i < A.length;i++)
        {
            for(int j = 0; j < A[i].length;j++)
            {
                if(i == j)
                {
                    if(A[i][j] == 1)
                    {
                        teste[i][j] = true;
                    }
                    else
                    {
                        teste[i][j] = false;
                    }
                }
                else
                {
                    if(A[i][j] == 0)
                    {
                        teste[i][j] = true;
                    }
                    else
                    {
                        teste[i][j] = false;
                    }
                }
            }
        }
        return teste;
    }


    //Metodo para ver se a matriz e identidade
    public static void matrizIdentidade(int [][] M)
    {
        int conta = 0;
        boolean [][]V = verificar(M);
         for(int i = 0; i < V.length;i++)
         {
             for(int j = 0;j<V[i].length;j++)
             {
                 if(!V[i][j])
                 {
                     conta++;
                 }
             }
         }

         if(conta > 0)
         {
             System.out.println("A matriz nao e identidade!");
         }
         else
         {
             System.out.println("A matriz e identidade");
         }
    }

    //Metodo Main
    public static void main(String[] args) {
        System.out.println("Digite a ordem da Matriz: ");
        int ordem = teclado.nextInt();
        int [][] M = preencherMatriz(ordem);
        matrizIdentidade(M);
    }


}
