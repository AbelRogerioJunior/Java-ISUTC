import java.util.Scanner;

public class Condicao{
	public static void main(String [] Args){
		Scanner Teclado = new Scanner(System.in);
		int quant = 15;
		System.out.print("Digite o valor: ");
		int valor = Teclado.nextInt();
		if(valor > 12){
			valor = (quant * 12);
		} else{
			valor = (quant * 15);
		}
		System.out.print("O valor e => " + valor);
	}
}