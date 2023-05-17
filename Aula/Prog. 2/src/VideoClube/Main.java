package VideoClube;

import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Vector <DVD> vect = new Vector<>();

        DVD filme1 = new DVD(0, "Guerra Das Estrelas", "Ficcao", "2021/02/21");
        DVD filme2 = new DVD(1, "Titanic", "Romance", "1998/05/13");
        Operacoes op = new Operacoes();
        op.add(filme1, vect);
        op.add(filme2, vect);
        op.listar(vect, "ROmancE");
    }
}
