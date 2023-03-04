import java.util.Scanner;

public class LoginSenha {
    public static void main(String[] args) {
        //Declaracao de classe
        Scanner ler = new Scanner(System.in);

        //Declaracao dos dados
        String user = "Abel Rogerio Mandlate junior";
        String acesso = "100106530397C";

        //Leitura do id e da senha
        System.out.print("Digite seu login: ");
        String login = ler.nextLine();
        System.out.print("Digite sua senha: ");
        String senha = ler.nextLine();

        //Verifiar se tem acesso
        if((login.equals(user)) && (senha.equals(acesso)))
        {
            System.out.print("Seja bem Vindo");
        }
        else
        {
            System.out.print("Login ou senha nao existe!");
        }
    }
}
