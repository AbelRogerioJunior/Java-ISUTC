package aulaVetores;

import java.util.Scanner;
import java.util.Vector;
public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o tamanho do tamanho: ");
        int tamanho = ler.nextInt();
        Vector<Integer> V = new Vector<>(tamanho);
        int maior = 0;
        int menor = 0;
        for(int i = 0; i < tamanho;i++) {
            System.out.println("Digite o " + (i + 1) + " elemento: ");
            int valor = ler.nextInt();
            if (i == 0) {
                maior = valor;
                menor = valor;
            } else if (maior < valor) {
                maior = valor;
            }
            if (menor > valor) {
                menor = valor;
            }
            V.insertElementAt(valor, i);
        }

        System.out.println("Maior: "+maior);
        System.out.println("Menor: "+menor);
        ler.close();
    }
}
