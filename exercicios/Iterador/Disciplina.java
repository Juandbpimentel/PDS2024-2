import java.util.ArrayList;

public class Disciplina implements Agregador<Aluno> {
    ArrayList<Aluno> alunos = new ArrayList<Aluno>();
    IFabricaIteradores<Aluno> fabricaIteradores;

    public Disciplina() {
        this.fabricaIteradores = new FabricaIteradoresAluno();
    }

    public void addAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public Iterador<Aluno> criarIterador(TiposIteradores tipo) {
        return fabricaIteradores.criarIterador(tipo, alunos.toArray(new Aluno[0]));
    }
}