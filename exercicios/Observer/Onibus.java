import java.util.ArrayList;

public class Onibus implements ISujeitoObservavel{
    protected OnibusEstado estadoAtual = OnibusEstado.CHEGOU_RODOVIARIA;
    protected ArrayList<IObservador> observadores = new ArrayList<>();

    public void adicionarObservador(IObservador observador) {
        this.observadores.add(observador);
    }

    public void removerObservador(IObservador observador) {
        this.observadores.remove(observador);
    }

    public void notificarObservadores() {
        for(IObservador observador : observadores) {
            observador.atualizar(estadoAtual);
        }
    }

    public void setEstado(OnibusEstado estado) {
        if (this.estadoAtual == estado) return;
        this.estadoAtual = estado;
        notificarObservadores();
    }
}
