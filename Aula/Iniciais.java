//Importacoes
import java.util.Scanner;


//Programa Principal
public class Iniciais {
    public static void main(String[] args) {
        //Declaracao da classe
        Scanner ler = new Scanner(System.in);

        //Leitura do nome
        System.out.println("Digite seu nome: ");
        String nome = " " + ler.nextLine();
		
		
        //Verificacao das Iniciais
        String substring = "";
        String inicias = "";
        for (int i = 0; i < nome.length(); i++) {
            if (nome.charAt(i) == ' ') {
                inicias += nome.charAt(i + 1);
            }
        }
        System.out.print(inicias);
    }
}
