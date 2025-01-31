package projeteis;

import interfaces.IProjetil;

public class PatoDeBorracha implements IProjetil {
    public PatoDeBorracha(){}
    public void efeito(){
        System.out.println("Pato de borracha atirado");
    }
}