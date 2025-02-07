public class FabricaIteradoresAluno implements IFabricaIteradores<Aluno>{
    @Override
    public Iterador<Aluno> criarIterador(TiposIteradores tipo, Aluno[] alunos) {
        return switch(tipo){
            case ORDEM_ALFABETICA -> new IteradorOrdemAlfabetica(alunos);
            case ORDEM_DE_ADICAO -> new IteradorOrdemDeAdicao(alunos);
            case ORDEM_DE_ADICAO_INVERSA -> new IteradorInversoDaOrdemDeAdicao(alunos);
        };
    }
}
