
/*Abel Junior LEIT 11
 * Ex02 Recursividade
 * */

//Importacao
import java.util.Scanner;

public class Abel_Recur_01
{
    //Metodo recusivo Potenciacao
    public static int potenciacao(int base,int exp)
    {
        if(base == 1 )
        {
            return 1;
        }
        else if(exp == 0)
        {
            return 1;
        }
        return base* potenciacao(base,exp-1);
    }

    //Metodo main
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite valor da base: ");
        int base = teclado.nextInt();
        System.out.print("Digite valor do expoente: ");
        int expoente = teclado.nextInt();
        int result = potenciacao(base,expoente);
        System.out.printf("%d ^ %d = %d",base,expoente,result);
    }

}
