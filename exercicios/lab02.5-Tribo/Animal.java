import java.util.ArrayList;
import java.util.Iterator;

public abstract class Animal implements Movel{
	private String nome;

	public Animal( String aNome, aNumPatas) 
	{ 
		nome = aNome;
		numPatas = aNumPatas;
	}

	public int getNumPatas() { 
		return numPatas; 
	}

	public boolean equals(Object obj){ 
		Animal a = (Animal) obj; 
		if  
		((this.nome.equalsIgnoreCase(a.nome)) && 
				(this
						.especie.equalsIgnoreCase(a.especie))){ 
			return true; 
		} 
		return false; 
	}

	public String getNome() { 
		return nome; 
	} 

	public void setNome(String nome) { 
		this.nome = nome; 
	}
}
