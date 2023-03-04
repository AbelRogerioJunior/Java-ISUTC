//Nome: Abel Junior Leit 11

//Importacoes
import java.util.Scanner;


//Classe Principal
public class desenharQuadrado
{
    //Metodo Quadrado
    public static void quadrado(int n)
    {
        for(int i = 0;i<n;i++)
        {
            for(int j = 0;j < n;j++)
            {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }


    //Metodo Main
    public static void main(String[] args)
    {
        Scanner ler = new Scanner(System.in);

        //Ler o tamanho
        System.out.println("Digite o lado: ");
        int n = ler.nextInt();
        quadrado(n);
    }
}
