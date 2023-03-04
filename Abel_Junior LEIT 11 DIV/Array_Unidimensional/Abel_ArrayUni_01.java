/*Abel Junior LEIT 11
 * Ex08 Array Unidimensional
 * */
 
 //Importacao
import java.util.Scanner;


public class Abel_ArrayUni_01
{
    //Variavel Global
    public static Scanner teclado = new Scanner(System.in);



    //Metodo preencher nome
    public static String [] preencherNome(int tamanho)
    {
        String []V = new String[tamanho];

        for(int i = 0; i < tamanho;i++)
        {
            System.out.println("Nome da "+(i+1)+" pessoa: ");
            V[i] = teclado.next();
        }

        return V;
    }

    //Consultar Nome
    public static void consultarNome(String[] V)
    {
        System.out.println("Digite a posicao do nome quer verificar: ");
        int opcao = teclado.nextInt();

        if(opcao <= 0 || opcao > V.length)
        {
            System.out.println("Erro! Nao existe nome nessa posicao.");
        }
        else
        {
            System.out.println("Nome: "+V[opcao-1]);
        }
    }

    //Metodo Main
    public static void main(String[] args)
    {
        System.out.println("Quantas pessoas quer Cadastrar: ");
        int tam = teclado.nextInt();
        String []V = preencherNome(tam);

        consultarNome(V);
    }
}
