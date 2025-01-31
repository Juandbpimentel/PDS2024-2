package armas;

import interfaces.IArma;
import interfaces.IProjetil;
import projeteis.BolaDeFerro;
import projeteis.PatoDeBorracha;

public class Canhao implements IArma {
	IProjetil projetil;
	public Canhao(){
		this.projetil = new BolaDeFerro();
	}
	public Canhao(IProjetil projetil){
		this.projetil = projetil;
	}
	public void atirar(){
		projetil.efeito();
	}
}