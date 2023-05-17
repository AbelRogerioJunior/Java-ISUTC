package alun;

import java.util.Vector;

public class GerenciarAluno {
    public void listenporTurma(Vector v, String turma){
        for (int i = 0; i< v.size(); i++){
            if ((Aluno)v.get(i)).getTurma().equals(turma){
                System.out.println((Aluno)v.get(i).getTurma());
            }
        }
    }
    
}
