package aula09;

public class OrdemArray {


    static void verificarOrdem(int [] Array){
        int erro = 0;
        String ordem = "";
        if(Array.length == 1){
            ordem = "Crescente";
        }else if(Array[1] >= Array[0]){
            for(int i = 0; i < Array.length;i++){
            
                if(i == 0){

                }else if(Array[i] < Array[i-1]){
                    erro++;
                }
                if(i == Array.length-1){
                    ordem = "Crescente";
                }
            }
        }else{
            for(int i = 0; i < Array.length;i++){
            
                if(i == 0){

                }else if(Array[i] > Array[i-1]){
                    erro++;
                }

                if(i == Array.length -1){
                    ordem = "Descrecente";
                }
            }
        }

        if(erro > 0){
            System.out.println("O array esta desordenado");
        }else{
            System.out.println("O array esta ordenado! De maneira " + ordem);
        }            
    }



    public static void main(String[] args) {
        int  []Array = {5,5,5,5,9};
        verificarOrdem(Array);
    }
}
