public class Cliente {
    public Cliente(){}
    
    public static void main(String[] args) {
        Cliente e = new Cliente();
        e.iniciaExemplo();
    }

    public void iniciaExemplo() {
        Disciplina disciplina = new Disciplina();
        IFabricaIteradores fabricaIteradores = new FabricaIteradoresAluno();
        disciplina.addAluno(new Aluno("João"));
        disciplina.addAluno(new Aluno("Maria"));
        disciplina.addAluno(new Aluno("José"));
        disciplina.addAluno(new Aluno("Pedro"));
        disciplina.addAluno(new Aluno("Ana"));
        disciplina.addAluno(new Aluno("Carlos"));
        disciplina.addAluno(new Aluno("Mariana"));
        Iterador<Aluno> iterador = disciplina.criarIterador(TiposIteradores.ORDEM_ALFABETICA);
        while (iterador.temProximo()) {
            Aluno aluno = iterador.proximo();
            System.out.println(aluno.nome);
        }
    }
}