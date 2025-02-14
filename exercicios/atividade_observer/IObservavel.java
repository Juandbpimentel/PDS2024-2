public interface IObservavel {
    void adicionarObservador(IObservador observador);
    void removerObservador(IObservador observador);
    void notificarObservadores();
}
