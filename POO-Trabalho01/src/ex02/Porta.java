package ex02;

public class Porta {
    float x;
    float y;
    boolean estado;

    public void abrirPorta(){
        if(estado == true){
            System.out.println("A porta ja esta aberta!");
        }else{
            estado = true;
        }
    }

    public void fecharPorta(){
        if(estado != true){
            System.out.println("A porta ja esta fechada!");
        }else{
            estado = false;
        }
    }

    public void verEstado(){
        if(estado == true){
            System.out.println("Porta esta Aberta");
        }else{
            System.out.println("Porta esta Fechada!");
        }
    }
}
