package pet;
import java.time.Clock;
import java.time.Duration;
//constructor 
public class VirtualPet {
	
	//local variable to make acessor..well accessible(instance variables)
		private String animal;	
		private String health;
		private int l;
		private String happiness;
		private int e;
		private String hunger;
		//matching construtor (builds the object)
	public VirtualPet(String animal, String health, int l, String happiness, int e) {
		this.animal=animal;
		this.health=health;
		this.l=l;
		this.happiness=happiness;
		this.e=e;
	}
	
	
		
	//accessor method=access information in app
	public String getanimal() {
		return animal;
	}

	public String gethealth() {
		
		return health;
	}

	public int getl() {
		
		return l;
		
	}

	public String gethappiness() {
		
		return happiness;
	}

	public int gete() {
		return e;
	}

	 

	
}
				
		
		
		
		

