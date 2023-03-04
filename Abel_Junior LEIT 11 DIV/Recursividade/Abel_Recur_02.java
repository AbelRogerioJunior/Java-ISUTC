
/*Abel Junior LEIT 11
 * Ex02 Recursividade
 * */

//Importacao
import java.util.Scanner;

public class Abel_Recur_02
{
    //Metodo Recursivo Fatorial
    public static int fatorial(int n)
    {
        if(n == 0 || n == 1)
        {
            return 1;
        }
        return n * fatorial(n-1);
    }



    //Metodo Main
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Quer factorial de que numero: ");
        int num = teclado.nextInt();
        int result = fatorial(num);
        System.out.printf("O fatorial de %d e %d",num,result);
    }
}
