public class FabricaIteradoresProfessor implements IFabricaIteradores<Professor> {
    public Iterador<Professor> criarIterador(TiposIteradores tipo, Professor[] professores) {
        switch (tipo) {
            case ORDEM_DE_ADICAO:
                return new IteradorOrdemDeAdicao<Professor>(professores);
            case ORDEM_DE_ADICAO_INVERSA:
                return new IteradorOrdemDeAdicaoInversa<Professor>(professores);
            case ORDEM_ALFABETICA:
                return new IteradorOrdemAlfabetica<Professor>(professores);
            default:
                return null;
        }
    }
}
