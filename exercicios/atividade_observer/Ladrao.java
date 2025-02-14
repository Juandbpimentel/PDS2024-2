import java.util.Objects;

public class Ladrao implements IObservador {
    private String nome;
    private Boolean dormindo = true;
    private int ovosRoubados = 0;

    public Ladrao(String nome) {
        this.nome = nome;
    }

    public void atualizar(Boolean dormindo, String nomeDoLadrao, int ovosRoubadosPeloLadrao) {
        String mensagem = "Nova mensagem para " + nome + ": ";
        if (dormindo) {
            if (nomeDoLadrao.equals(nome)) {
                mensagem += "Você roubou "+ovosRoubadosPeloLadrao+" ovos, a dragoa ainda está dormindo, continue roubando!";
            } else {
                mensagem += nomeDoLadrao + " roubou "+ovosRoubadosPeloLadrao+" ovos, a dragoa ainda está dormindo, não foi dessa vez...";
            }
        } else {
            if (nomeDoLadrao.equals(nome)) {
                mensagem += "Você roubou "+ovosRoubadosPeloLadrao+" ovos, a dragoa acordou e está correndo atrás de você! Corra para as montanhas!";
            } else {
                mensagem += nomeDoLadrao + " roubou "+ovosRoubadosPeloLadrao+" ovos, a dragoa acordou e está correndo atrás dele! Corra para as montanhas!";
            }
        }
        System.out.println(mensagem);
    }

    public void roubarOvos(int ovos, MaeDragoa maeDragoa) {
        ovosRoubados += ovos;
        maeDragoa.terOvosRoubados(ovos, nome);
    }

    public String getNome() {
        return nome;
    }
}
