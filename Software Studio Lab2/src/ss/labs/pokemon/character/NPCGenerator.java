package ss.labs.pokemon.character;

import ss.labs.pokemon.PokemonData;

import java.util.ArrayList;

/**
 * Created by jerry on 2017/3/7.
 * In this practice you will see the power of polymorphism
 * practice to inherit and
 */
public class NPCGenerator {
    //no modifier is private
    private ArrayList<NPC> npcTemplates;
    public NPCGenerator()
    {
        npcTemplates = new ArrayList<>();
        //TODO create some NPC and put into the template list. At least one for each type of character
        String npcName = "Harris";
        String npcJob = "Villager";
        String npcQuote = "What's up?";
        NPC newNPC = new NPC(npcName, npcJob, npcQuote);
        npcTemplates.add(newNPC);

        String npcName1 = "John";
        String npcJob1 = "Student";
        String npcQuote1 = "How are you?";
        NPC newNPC1 = new NPC(npcName1, npcJob1, npcQuote1);
        npcTemplates.add(newNPC1);

        int pokemonID = 1;
        String pokemonName = "Pikachu";
        String pokemonType = "Electic";
        String pokemonMove = "Thunderbolt";
        PokemonData pokemon = new PokemonData(pokemonID, pokemonName, pokemonType, pokemonMove);
        String trainerName = "Bjorn";
        String trainerJob = "Pokemon Trainer";
        String trainerQuote = "Let's fight!";
        PokemonTrainer trainer = new PokemonTrainer(trainerName, trainerJob, trainerQuote, pokemon);
        npcTemplates.add(trainer);

        int pokemonID1 = 2;
        String pokemonName1 = "Alakazam";
        String pokemonType1 = "Psychic";
        String pokemonMove1 = "Confusion";
        PokemonData pokemon1 = new PokemonData(pokemonID1, pokemonName1, pokemonType1, pokemonMove1);
        String trainerName1 = "Juan Gonzales";
        String trainerJob1 = "Pokemon Trainer";
        String trainerQuote1 = "Let's have some fun!";
        PokemonTrainer trainer1 = new PokemonTrainer(trainerName1, trainerJob1, trainerQuote1, pokemon1);
        npcTemplates.add(trainer1);
    }

    //Try ctrl-N or command-N, click on Getter, you will see something useful
    //TODO write a public method to return npctemplates
    public ArrayList<NPC> getNpcTemplates() {
        return npcTemplates;
    }
}
