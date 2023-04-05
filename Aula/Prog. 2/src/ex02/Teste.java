package ex02;

public class Teste {
    public static int buscarSequencia(int [] array, int valor){
        int pos = 0;
        for(int i = 0; i < array.length;i++){
            if(valor == array[i]){
                pos = i;
                break;
            }
        }
        return pos;
    }

    public static void main(String[] args) {
        int [] array = {12,46,76,45,365,86,23,98,5,3,98};
        int res = buscarSequencia(array,365);
        System.out.println("O valor esta no indice "+res+ " do array!!!");
        
    }
}