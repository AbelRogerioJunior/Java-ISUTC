/*Abel Junior LEIT 11
* Ex06 String
* */

//Importacao
import java.util.Scanner;

//Classe
public class Abel_String_01
{

    //Metdo Escada Invertida
    public static void escadaInvertida(String nome)
    {
        for(int i = 0; i < nome.length();i++)
        {
            System.out.println(nome.substring(0, nome.length()-i));
        }
    }


    //Metodo Main
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = teclado.nextLine();
        escadaInvertida(nome);
    }
}
