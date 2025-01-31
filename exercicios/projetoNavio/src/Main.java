import armas.Bazuca;
import armas.Canhao;
import interfaces.IArma;
import projeteis.BolaDeFerro;
import projeteis.Missil;
import projeteis.PatoDeBorracha;
import projeteis.PatoDeBorrachaExplosivo;

public class Main {
    public static void main(String[] args) {
        Bazuca bazuca = new Bazuca();

        Navio navio = new Navio(bazuca);
        navio.atacar();
        bazuca.setProjetil(new PatoDeBorrachaExplosivo());
        navio.setArma(bazuca);
        navio.atacar();

        Canhao canhao = new Canhao();
        navio.setArma(canhao);
        navio.atacar();
        navio.setArma(new Canhao(new PatoDeBorracha()));
        navio.atacar();
    }
}
