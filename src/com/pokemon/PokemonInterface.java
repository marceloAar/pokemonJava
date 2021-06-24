
//Marcelo Aceituno R
//Full Stack JAVA 0034
//Pokemon
package com.pokemon;

public interface PokemonInterface {
	
	public String createPokemon(String name, int health, String type); //: Este m�todo crea y retorna un Pokemon.
	
	public String pokemonInfo(String pokemon); //: Este m�todo devuelve un string con el name, health, y type del Pokemon.
	
	public String listPokemon(); //: Lista el nombre de todos los Pokemones que tienes en la Pokedex.

}
