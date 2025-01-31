import interfaces.IArma;

public class Navio{
	IArma arma;

	public Navio(IArma arma){
		this.arma = arma;
	}
	public void setArma(IArma arma){
		this.arma = arma;
	}
	public void atacar(){
		this.arma.atirar();
	}
}