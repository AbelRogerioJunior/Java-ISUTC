//Nome: Abel Rogerio Mandlate Junior LEIT_11

//Importacoes
import java.util.*;

//Classe
public class Abel_Linguagens_Exame
{
	//Variavel Global
	public static Scanner ler = new Scanner(System.in);
	
	//Metodo preencherArray
	public static ArrayList<String> preencherArray(int tam)
	{
		ArrayList<String> lista = new ArrayList<>();
		
		for(int i = 0; i < tam;i++)
		{
			System.out.print("Digite "+(i+1)+" linguagem: ");
			String aux = ler.next();
			aux = aux.trim();
			//Parte para ver ultima vogal
			
				if(aux.charAt(aux.length() - 1) == 'a' || aux.charAt(aux.length() - 1) == 'e' || aux.charAt(aux.length() - 1) == 'i' || aux.charAt(aux.length() - 1) == 'o' || aux.charAt(aux.length() - 1) == 'u')
				{
					lista.add(aux);
				}
			
		}
		return lista;
	}
	
	//Metodo removerLinguagem
	public static ArrayList<String> removerLinguagem(ArrayList<String>A,int pos)
	{
		
		A.remove(pos-1);
		return A;
		
	}
	
	//imprimir ArrayList
	public static void imprimirArray(ArrayList<String> A)
	{
		for(int i = 0; i < A.size();i++)
		{
			System.out.println("["+(i+1)+"]"+" Linguagem: "+A.get(i));
		}
	}
	
	//Metodo Main
	public static void main(String [] args)
	{
		System.out.print("Quantas linguagens quer inserir: ");
		int tam = ler.nextInt();
		ArrayList<String> linguagens = preencherArray(tam);
		System.out.println("===============================");
		System.out.println("Lista ORIGINAL");
		imprimirArray(linguagens);
		System.out.print("Qual linguagem quer remover: ");
		int pos = ler.nextInt();
		linguagens = removerLinguagem(linguagens,pos);
		System.out.println("===============================");
		System.out.println("Lista ALTERADA");
		imprimirArray(linguagens);
	}
}


