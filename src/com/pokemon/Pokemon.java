//Marcelo Aceituno R
//Full Stack JAVA 0034
//Pokemon
package com.pokemon;

//Crear una clase Pokemon con:
public class Pokemon {
	
	//name, health y type como variables principales.
	private String name;
	private int health;
	private String type;
	//Una variable static count para mantener el número de Pokemones creados en el programa.
	public static int numeroPokemon;
	
	public Pokemon() {
	}
	
	//Un constructor para establecer name, health y type en la creación de la instancia.
	public Pokemon(String name, int health, String type) {
		
		this.name = name;
		this.health = health;
		this.type = type;
		numeroPokemon++;
		
	}
	
	//void attackPokemon(Pokemon pokemon) Este método reduce la salud del Pokemon atacado en 10 puntos.
	public void attackPokemon() {
		int ataque = health - 10;
		this.setHealth(ataque);
		System.out.println("\nPokemon atacado - 10 pts .... >>"+getHealth()+" pts.\n");		
	}
	
	//Pokemon createPokemon(String name, int health, String type); 
	//Este método crea y retorna un Pokemon.	
	public String createPokemon(String name, int health, String type) {
				
		setName(name);
		setHealth(health);
		setType(type);
					
		return getName()+getHealth()+getType();		
			
	}
	
	//Este método devuelve un string con el name, health, y type del Pokemon.
	public String pokemonInfo() { 
		
		String datosPoke = "\nName: "+getName()+"\nHealth: "+getHealth()+"\nType: "+getType();
		
		return datosPoke;
	}	
	
	public void listPokemon() {		
		System.out.println(getName());
	}
		
	
	//Getter y Setter para cada variable principal.
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Pokemon [name=" + name + ", health=" + health + ", type=" + type + "]";
	}	

}
