package ss.labs.pokemon.character;

import ss.labs.pokemon.PokemonData;

import javax.lang.model.type.PrimitiveType;

/**
 * Created by jerry on 2017/3/7.
 */
public class PokemonTrainer extends NPC{
    protected PokemonData pokemonData;

    //TODO solve the error
    public PokemonTrainer(String name, String job, String quote, PokemonData data)
    {
        //TODO call super constructor
        super(name,job,quote);
        //TODO assign attributes
        pokemonData = data;
    }

    //TODO override toString()
    public String toString(){
        return super.toString()+"Pokemon data:\n"
                +"  id: " + pokemonData.getId() + "\n"
                +"  name: " + pokemonData.getName() + "\n"
                +"  type: " + pokemonData.getType() + "\n"
                +"  move: " + pokemonData.getMove() + "\n";
    }
}
