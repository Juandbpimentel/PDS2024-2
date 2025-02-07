import java.util.ArrayList;
import java.util.Comparator;

public class IteradorOrdemAlfabetica implements Iterador<Aluno>{
    Aluno[] alunos;
    int posicao;
    //ArrayList<Aluno> alunos;

    public IteradorOrdemAlfabetica(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public IteradorOrdemAlfabetica(ArrayList<Aluno> novosAlunos) {
        novosAlunos.sort(Comparator.comparing(a -> a.nome));
        this.alunos = novosAlunos.toArray(new Aluno[0]);
        this.posicao = 0;
    }

    //public void addAluno(Aluno aluno) {
    //    //alunos.add(aluno);
    //    Aluno[] novosAlunos = new Aluno[this.alunos.length + 1];
    //    for (int i = 0; i < this.alunos.length; i++) {
    //        novosAlunos[i] = this.alunos[i];
    //    }
    //    novosAlunos[this.alunos.length] = aluno;
    //    this.alunos = novosAlunos;
    //}

    @Override
    public boolean temProximo() {
        return posicao < alunos.length && alunos[posicao] != null;
    }

    @Override
    public Aluno proximo() {
        if (posicao >= alunos.length) return null;
        return alunos[posicao++];
    }
}
