public class Troca{
    public void troca(Indio indio1, Tribo tribo1, Animal animal1, Indio indio2, Tribo tribo2, Animal animal2){
		if (indio1.equals(tribo1.getCacique()) && indio2.equals(tribo2.getCacique())){
            tribo1.removeAnimal(animal1);
		    tribo1.adicionaAnimal(animal2); 
            tribo2.removeAnimal(animal2); 
            tribo2.adicionaAnimal(animal1); 
        } 
	}
}