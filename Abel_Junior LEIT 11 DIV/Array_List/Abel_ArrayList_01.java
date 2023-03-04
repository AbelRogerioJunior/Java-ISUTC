/*Abel Junior LEIT 11
 * Ex02 ArrayList
 * */

//Importacoes
import java.util.ArrayList;
import java.util.Scanner;


//Classe
public class Abel_ArrayList_01
{
    //Variavel Global
    public static Scanner teclado = new Scanner(System.in);

    //Metodo Preencher ArrayList
    public static ArrayList<Integer> preencherLista(int n)
    {
        ArrayList<Integer> lista = new ArrayList<>();
        for(int i = 0; i < n;i++)
        {
            System.out.print("Digite o "+(i+1)+" elemento da lista: ");
            int valor = teclado.nextInt();
            lista.add(valor);
        }
        return lista;
    }

    //Metod ver maior valor da lista
    public static void maior(ArrayList<Integer> lista)
    {
        int maior = 0;
        for(int i = 0;i < lista.size();i++)
        {
            if(i== 0)
            {
                maior = lista.get(i);
            }
            else if(lista.get(i) > maior) {
                maior = lista.get(i);
            }
        }
        System.out.println("O maior valor da lista e " + maior);
    }

    //Metod ver maior
    public static void menor(ArrayList<Integer> lista)
    {
        int menor = 0;
        for(int i = 0;i < lista.size();i++)
        {
            if(i== 0)
            {
                menor = lista.get(i);
            }
            else if(lista.get(i) < menor) {
                menor = lista.get(i);
            }
        }
        System.out.println("O menor valor da lista e " + menor);
    }

    //Metodo maior e menor
    public static void maiorMenorLista(ArrayList<Integer> lista)
    {
        maior(lista);
        menor(lista);
    }

    //Metodo Main
    public static void main(String[] args)
    {
        System.out.println("Digite quantos elementos quer inserir: ");
        int tamanho = teclado.nextInt();
        ArrayList<Integer> lista = preencherLista(tamanho);
        maiorMenorLista(lista);
    }
}
