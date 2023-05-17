package aulaVetores;

import java.util.Scanner;
import java.util.Vector;

public class OrganizarArray {
    
    //Metodo ordenar Array
    static Vector<Integer> ordenarArray(Vector<Integer> V){
        int aux = 0;
        for(int i = 0; i < V.size();i++){
            for(int j = 0; j < V.size();j++){
                if(V.get(i) > V.get(j)){
                    aux = V.get(j);
                    V.setElementAt(V.get(j), i);
                    V.setElementAt(i, aux);
                }
            }
        }
        return V;
    }


    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Tamanho: ");
        int tamanho = ler.nextInt();
        Vector<Integer> V = new Vector<>(tamanho);
        for(int i = 0; i < tamanho;i++){
            System.out.println((i+1)+" - Elemento: ");
            int valor = ler.nextInt();
            V.insertElementAt(valor, i);
        }
        System.out.println(V.toString());

        V = ordenarArray(V);
        System.out.println(V.toString());
        ler.close();
    }
}
