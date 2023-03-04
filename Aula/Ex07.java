//Importacao de Bibliotecas
import java.util.Scanner;


//Programa Principal
public class Ex07{
	public static void main(String [] Args){
		float NovoCred = 0;
		Scanner Teclado = new Scanner(System.in);
		final float SaldoM = 3500f;
		
		//Leitura dos Dados
		System.out.println("<<VALOR MEDIO!!!>>");
		System.out.print("Qual e o seu saldo? ");
		float Credito = Teclado.nextFloat();
		
		
		//Conversao do novo Saldo
		if (Credito <= 200){
			NovoCred = Credito;
		} else {
			if ((Credito > 200) && (Credito <=400)){
				NovoCred = Credito + (SaldoM*20/100);
			}else{
				if ((Credito > 400) && (Credito >= 600)){
					NovoCred = Credito + (SaldoM*30/100);
				}else {
					if (Credito > 600){
						NovoCred = Credito + (SaldoM*40/100);
					}
				}
			}
		}
		//Impressao do novo saldo na Tela
		System.out.print("O seu saldo com o bonus de  " + NovoCred);
	}
}