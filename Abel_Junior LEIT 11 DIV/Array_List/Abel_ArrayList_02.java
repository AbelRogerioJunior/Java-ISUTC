/*Abel Junior LEIT 11
 * Ex03 Array List
 * */

import java.util.ArrayList;
import java.util.Scanner;

public class Abel_ArrayList_02
{
    //Variavel Global
    public static Scanner teclado = new Scanner(System.in);

    //Metodo Preecher Lista
    public static ArrayList<Integer> preencherLista(int tamanho)
    {
        ArrayList<Integer> lista = new ArrayList<>();

        for(int i = 0; i < tamanho;i++)
        {
            System.out.println((i+1)+" valor: ");
            int valor = teclado.nextInt();
            lista.add(valor);
        }
        return lista;
    }

    //Metodo soma
    public static int somalista(ArrayList<Integer> lista)
    {
        int soma = 0;
        for (int valor : lista) {
            soma += valor;
        }
        return soma;
    }

    //Metodo Media
    public static void mediaLista(ArrayList<Integer> lista)
    {
        int soma = somalista(lista);
        float media = soma / lista.size();
        System.out.println("A media dos valores da lista e "+ media);
    }

    //Metodo Main
    public static void main(String[] args)
    {
        System.out.print("Quantos valores quer inserir na lista: ");
        int tamanho = teclado.nextInt();
        ArrayList<Integer> lista = preencherLista(tamanho);
        mediaLista(lista);
    }
}
