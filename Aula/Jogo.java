//Importacao
import java.util.Random;
import java.util.Scanner;





public class Jogo{
	public static void main(String [] Args){
		//Invocacoes das Importacoes
		Random dado = new Random();
		Scanner ler = new Scanner(System.in);

		//Leitura dos numeros e Verificar se e verdadeiro ou falso
		int acertos = 0;
		int erros = 0;
		for(int cont = 1; cont <=10;cont++){
			System.out.print("Que e o "+ cont +" numero dado escolher? ");
			int resp = ler.nextInt();
			int x = dado.nextInt(6)+1;
			System.out.println(cont +" Jogada foi => " + x);
			if(resp == x){
				System.out.println("ACERTOU!!!");
				acertos +=1;
			}else{
				System.out.println("ERROU");
				erros +=1;
			}
		}
		System.out.println("Voce acertou " +acertos + " vezes!!!");
		System.out.println("Voce errou " + erros + " vezes!!!");
		System.out.print("<<FIM DO PROGRAMA!!!>>");
	}
}