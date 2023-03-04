import java.util.Scanner;


public class Fibonnaci{
    public static void main(String[] args) {
        int t1,t2,t3,cont;
        t1 = 0;
        t2 = 1;
        cont = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("<<SERIE DE FIBONNACI!!!>>");
        System.out.print("Digite o numero de termos da serie: ");
        int limite = teclado.nextInt();
        System.out.print(t1 + " ");
        System.out.print(t2);
        while(cont <= limite){
            t3 = t1 + t2;
            t1 = t2;
            t2 = t3;
            cont++;
            System.out.print(" "+t3);
        }
    }
}
