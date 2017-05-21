package ss.labs.pokemon;

/**
 * Created by jerry on 2017/3/1.
 */

public class PokemonSpeciesData implements Comparable<PokemonSpeciesData>
{
    private int id;
    private String speciesName;
    private PokemonValueData speciesValue;

    //HashMap<Integer,MoveData> learnMoveTable;
    public PokemonSpeciesData(int id, String speciesName,PokemonValueData valueData)
    {
        this.id = id;
        this.speciesName = speciesName;
        this.speciesValue = valueData;
    }

    public int getId() {
        return id;
    }

    public String getSpeciesName() {
        return speciesName;
    }

    public PokemonValueData getSpeciesValue() {
        return speciesValue;
    }

    public int compareTo(PokemonSpeciesData o) {
        return this.id - o.getId();
    }
}

//https://wiki.52poke.com/wiki/种族值