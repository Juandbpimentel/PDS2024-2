package projeteis;

import interfaces.IProjetilExplosivo;

public class Missil implements IProjetilExplosivo {

    public Missil(){}
    public void efeitoExplosivo(){
        System.out.println("Missil atirado");
    }
}
