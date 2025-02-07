import java.util.ArrayList;

public class IteradorInversoDaOrdemDeAdicao<T> implements Iterador<T>{
    T[] objetos;
    int posicao;
    //ArrayList<Aluno> objetos;

    public IteradorInversoDaOrdemDeAdicao(T[] objetos) {
        this.objetos = objetos;
    }

    public IteradorInversoDaOrdemDeAdicao(ArrayList<T> novosAlunos) {
        this.objetos = novosAlunos.toArray((T[]) new Object[0]);
        this.posicao = objetos.length - 1;
    }

    //public void addAluno(Aluno aluno) {
    //    //objetos.add(aluno);
    //    Aluno[] novosAlunos = new Aluno[this.objetos.length + 1];
    //    for (int i = 0; i < this.objetos.length; i++) {
    //        novosAlunos[i] = this.objetos[i];
    //    }
    //    novosAlunos[this.objetos.length] = aluno;
    //    this.objetos = novosAlunos;
    //}

    @Override
    public boolean temProximo() {
        return posicao > 0 && objetos[posicao] != null;
    }

    @Override
    public T proximo() {
        if (posicao < 0) return null;
        return objetos[posicao--];
    }
}
