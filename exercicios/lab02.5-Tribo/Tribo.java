import java.util.ArrayList;

public class Tribo {
	private ArrayList<Animal> animais; 
	private ArrayList<Indio> indios; 
	private Indio cacique;

	public Tribo() { 
		animais = new ArrayList<Animal>(); 
	}

	public void adicionaAnimal(Indio indio,Animal animal) {
		
			animais.add(animal);

	}

	public boolean estaNessaTribo(Animal animal){ 
		return animais.contains(animal); 
	}

	public int getNumPatas(){

	}
	
	public ArrayList<Animal> getAnimais() { 
		return animais; 
	} 
	public void setAnimais(ArrayList<Animal> 
	animais) { 
		this.animais = animais; 
	} 
	public void removeAnimal(Animal animal) { 
		this.animais.remove(animal); 
	} 
	public void addIndio(Indio indio) { 
		this.indios.add(indio); 
	} 
	public ArrayList<Indio> getIndios() { 
		return indios; 
	} 
	public void setCacique(Indio cacique) { 
		this.cacique = cacique; 
	} 
	public Cacique getCacique() { 
		return this.cacique; 
	}
}
