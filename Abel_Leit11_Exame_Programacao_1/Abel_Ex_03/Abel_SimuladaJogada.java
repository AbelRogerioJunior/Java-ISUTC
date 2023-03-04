//Nome: Abel Rogerio Mandlate Junior LEIT_11

//importacoes
import java.util.*;


//Classe
public class Abel_SimuladaJogada
{
	
	//Metodo simular jogada
	public static void simularJogada()
	{
		Random valor = new Random();
		for(int i = 0; i < 5;i++)
		{
			int num = valor.nextInt(0,3);
			System.out.println((i+1)+" Jogada "+num);
		}
	}
	
	
	//Metodo Main
	public static void main(String [] args)
	{
		simularJogada();
	}
}