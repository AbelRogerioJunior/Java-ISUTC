package VideoClube;

import java.util.Vector;

public class Operacoes {
    //Metodos
    //Add
    public void add(DVD filme, Vector<DVD> vector){
        vector.add(filme);
    }

    //Listar
    public void listar(Vector<DVD> vector, String genero){
        for(int i =0;i< vector.size();i++){
            if(vector.get(i).getGenero().equalsIgnoreCase(genero)){
                System.out.println(vector.get(i));
                
            }
        }
    }
}
