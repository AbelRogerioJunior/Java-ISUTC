/*Abel Junior LEIT 11
 * Ex08 Array Unidimensional
 * */

//Importacoes
import java.util.Scanner;
import java.util.Arrays;

//Classe
public class Abel_ArrayUni_02
{
    //Variavel Global
    public static Scanner teclado = new Scanner(System.in);


    //Preencher Array
    public static int [] preencherArray(int num)
    {
        int []V = new int[num];

        for(int i = 0; i< num; i++)
        {
            System.out.println("Digite "+(i+1)+" valor: ");
            V[i] = teclado.nextInt();
        }

        return V;
    }

    //Metodo verificar se e positivo ou negativo
    public static boolean [] verificar(int []V)
    {
        boolean [] A = new boolean[V.length];

        for(int i = 0; i < V.length;i++)
        {
            if(V[i] < 0)
            {
                A[i] = false;
            }
            else
            {
                A[i] = true;
            }
        }
        return A;
    }

    //Metodo Imprimir array
    public static void imprimirArray(boolean [] A)
    {
        System.out.println(Arrays.toString(A));
    }

    //Metodo Main
    public static void main(String[] args)
    {
        System.out.println("Quantos valores quer inserir: ");
        int tamanho = teclado.nextInt();
        int []V = preencherArray(tamanho);
        boolean [] A = verificar(V);
        imprimirArray(A);
    }
}
