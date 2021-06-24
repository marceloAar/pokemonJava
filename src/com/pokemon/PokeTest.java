//Marcelo Aceituno R
//Full Stack JAVA 0034
//Pokemon
package com.pokemon;

public class PokeTest {

	public static void main(String[] args) {
		Pokemon poke1 = new Pokemon("Primero", 100, "Uno");
		Pokemon poke2 = new Pokemon("Segundo", 200, "Dos");
		Pokemon poke3 = new Pokemon("Tercero", 300, "Tres");
		
		System.out.println("Pokemones creados: "+Pokemon.numeroPokemon);
				
		System.out.println(poke1.pokemonInfo());
		System.out.println(poke2.pokemonInfo());	
		System.out.println(poke3.pokemonInfo());
		
		poke1.attackPokemon();
				
		poke1.listPokemon();
		poke2.listPokemon();
		poke3.listPokemon();		
		
	}

}
