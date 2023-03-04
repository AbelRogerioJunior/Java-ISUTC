//Importacao de bibliotecas
import java.util.Scanner;


//Programa Principal
public class Ex09{
	public static void main(String [] Args){
		//Introducao de Dados
		Scanner Teclado = new Scanner(System.in);
		System.out.print("Digite o Numero do Mes: ");
		int NrMes = Teclado.nextInt();
		String Mes = "";
		
		//Verificacao do Mes
		if (NrMes == 1){
			Mes = "Janeiro";
		}else if (NrMes == 2) {
			Mes = "Fevereiro";
		} else if (NrMes == 3){
			Mes = "Marco";
		}else if (NrMes == 4){
			Mes = "Abril";
		}else if (NrMes == 5){
			Mes = "Maio";
		}else if (NrMes == 6){
			Mes = "Junho";
		}else if (NrMes == 7){
			Mes = "Julho";
		}else if (NrMes == 8){
			Mes = "Agosto";
		}else if (NrMes == 9){
			Mes = "Setembro";
		}else if (NrMes == 10){
			Mes = "Outubro";
		}else if (NrMes == 11){
			Mes = "Novembro";
		}else if (NrMes == 12){
			Mes = "Dezembro";
		}else{
			Mes = "Invalido";
		}
		
		//Resultado na Tela
		System.out.println("O Mes que Voce Digitou e " + Mes);
		System.out.print("<<FIM DO PROGRAMA!!!>>");
	}
}