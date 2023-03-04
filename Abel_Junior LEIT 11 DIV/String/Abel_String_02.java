/*Abel Junior LEIT11
* String Ex 03 da Ficha Resumo
* */

//Importacao
import java.util.Scanner;

//Classe
public class Abel_String_02
{
    //Metodo Inverter
    public static void inverter(String nome)
    {
        String temp = "";
        for(int i = 0; i < nome.length();i++)
        {
            temp = nome.charAt(i) + temp;
        }
        System.out.println(temp);
    }



    //Metodo Main
    public static void main(String[] args)
    {
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe seu nome: ");
        String nome = ler.nextLine();
        inverter(nome.toUpperCase());
    }
}
