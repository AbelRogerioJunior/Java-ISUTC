//Importacoes
import java.util.Scanner;


//Programa Principal
public class Ex12{
	public static void main(String [] Args){
		//Introducao de dados
		Scanner Teclado = new Scanner(System.in);
		System.out.print("Digite o valor do Produto: ");
		float valor = Teclado.nextFloat();
		float lucro = 0;
		
		//Verificacao da percentagem de lucro
		if (valor < 340){
			lucro =(valor*40/10);
		}else if ((valor >=340) &&(valor < 600)){
			lucro = (valor*35/100);
		}else{
			lucro = (valor*35/100);
		}
		
		
		//Resultado na Tela
		System.out.println("O seu lucro e de " + lucro + " Mzn");
		System.out.print("<<FIM DO PROGRAMA!!!>>");
	}
}