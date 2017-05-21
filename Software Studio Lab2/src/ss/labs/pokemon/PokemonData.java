package ss.labs.pokemon;

/**
 * Created by jerry on 2017/3/7.
 */
public class PokemonData{
    public PokemonData(int id, String name, String type, String move){
        this.id = id;
        this.name = name;
        this.type = type;
        this.move = move;
    }

    private int id;
    private String name;
    private String type;
    private String move;

    public int getId()
    {
        return id;
    }

    //Try ctrl-N or command-N, click on Getter, you will see something useful

    //TODO implement "get function" for name
    public String getName() {
        return name;
    }

    //TODO implement "get function" for type
    public String getType() {
        return type;
    }

    public String getMove() {
        return move;
    }
}
