//Nome: Abel Junior Leit 11

//Importacoes
import java.util.Scanner;


//Classe Principal
public class Triangulo
{
    //Metodo desenhar triangulo
    public static void desenharTriangulo()
    {
        Scanner ler = new Scanner(System.in);

        //Leitura do valor da base
        System.out.println("Digite o valor da base: ");
        int base = ler.nextInt();
        String triangulo = "";
        for(int i = 0; i< base;i++)
        {
            triangulo += "* ";
            System.out.println(triangulo);
        }
    }


    //Metodo Principal
    public static void main(String[] args)
    {

        desenharTriangulo();
    }
}
