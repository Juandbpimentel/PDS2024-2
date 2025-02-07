public interface IFabricaIteradores<TipoEntidade> {
    public Iterador<TipoEntidade> criarIterador(TiposIteradores tipo, TipoEntidade[] entidades);
}
