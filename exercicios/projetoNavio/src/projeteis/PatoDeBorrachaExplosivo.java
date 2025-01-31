package projeteis;

import interfaces.IProjetilExplosivo;

public class PatoDeBorrachaExplosivo implements IProjetilExplosivo {
    public PatoDeBorrachaExplosivo(){}
    public void efeitoExplosivo(){
        System.out.println("Pato de barracha explosivo apocaliptico atirado");
    }
}