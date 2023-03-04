//Nome: Abel Rogerio Mandlate Junior LEIT_11


//Importacoes
import java.util.*;

public class Abel_maiorValor_Exame
{
	//Variavel Global
	public static Scanner ler = new Scanner(System.in);
	
	//Metodo preencher Array
	public static void verMaior(int tam)
	{
		int maior = 0;
		for(int i = 0; i < tam;i++)
		{
			System.out.print((i+1)+" Valor: ");
			int valor = ler.nextInt();
			if(i==0)
			{
				maior = valor;
			}
			
			if(valor > maior)
			{
				maior = valor;
			}
		}
		System.out.print("O maior valor e "+ maior);
	}
	
	
	
	//Metodo main
	public static void main(String [] args)
	{
		System.out.print("Quantos valores quer inserir? ");
		int valor = ler.nextInt();
		verMaior(valor);
	}
}