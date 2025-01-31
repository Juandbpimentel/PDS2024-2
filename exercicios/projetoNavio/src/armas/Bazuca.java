package armas;

import interfaces.IArma;
import interfaces.IProjetilExplosivo;
import projeteis.Missil;

public class Bazuca implements IArma {
    
    IProjetilExplosivo projetil;

    public Bazuca(IProjetilExplosivo projetil) {
        this.projetil = projetil;
    }

    public Bazuca(){
        this.projetil = new Missil();
    }
    public void setProjetil(IProjetilExplosivo projetil){
        this.projetil = projetil;
    }

    public void atirar() {
        projetil.efeitoExplosivo();
    }
}
