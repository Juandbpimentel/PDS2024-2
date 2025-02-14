import java.util.ArrayList;

public class MaeDragoa implements IObservavel {
    private ArrayList<IObservador> observadores = new ArrayList<IObservador>();
    private int ovosRestantes;
    private Boolean dormindo = true;
    private String nomeLadraoAnterior = "";
    private int ovosRoubadosPeloLadraoAnterior = 0;

    public MaeDragoa() {
        this.ovosRestantes = 100;
    }
    public void adicionarObservador(IObservador observador) {
        observadores.add(observador);
    }

    public void removerObservador(IObservador observador) {
        observadores.remove(observador);
    }

    public void notificarObservadores() {
        for (IObservador observador : observadores) {
            observador.atualizar(dormindo, nomeLadraoAnterior, ovosRoubadosPeloLadraoAnterior);
        }
    }

    public void terOvosRoubados(int ovos, String nomeLadrao) {
        ovosRestantes -= ovos;
        nomeLadraoAnterior = nomeLadrao;
        ovosRoubadosPeloLadraoAnterior = ovos;
        if (ovosRestantes <= 0) {
            this.dormindo = (false);
        }
        notificarObservadores();
    }

    public Boolean getDormindo() {
        return dormindo;
    }
}
