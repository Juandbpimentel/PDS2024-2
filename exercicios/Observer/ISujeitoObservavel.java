public interface ISujeitoObservavel {
    void adicionarObservador(IObservador observador);
    void removerObservador(IObservador observador);
    void notificarObservadores();
}
