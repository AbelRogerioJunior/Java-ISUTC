//Nome: Abel Rogerio Mandlate Junior lEIT_11


//importacoes
import java.util.Scanner;


//Classe
public class Abel_Recursivo_Exame
{
	//Metodo Recursivo Sucessao
	public static int sucessao(int num)
	{
		if(num == 1)
		{
			return 1;
		}
		return sucessao(num - 1) + 2;
	}
	
	//Metodo Main
	public static void main(String [] args)
	{
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite o termo: ");
		int num = ler.nextInt();
		
		int result = sucessao(num);
		System.out.print("O resultado e "+ result);
	}
}