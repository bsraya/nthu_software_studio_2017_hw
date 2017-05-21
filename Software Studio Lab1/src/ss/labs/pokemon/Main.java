package ss.labs.pokemon;
import java.util.*;
public class Main {

    public static void main(String[] args) {

        //TODO declare and initiate a Scanner
        Scanner scan = new Scanner(System.in);

        //TODO declare and initiate pokedex as an ArrayList to store pokemon data
        ArrayList<PokemonData> pokedex = new ArrayList();

        //TODO declare and initiate typeCountMap as a HashMap to count the number of each types of pokemon
        HashMap<String, Integer> typeCountMap = new HashMap();

        System.out.println("Enter the Number of pokemon in the pokedex:");
        //TODO 0: scan the number of the testData from user input
        int times = scan.nextInt();

        //TODO use a loop to read several input data
        for(int i=0; i<times; i++)
        {
            System.out.println("Enter pokemon name:");
            //TODO 1-1:scan pokemon name and save to a variable from user input
            String name = scan.next();

            System.out.println("Enter pokemon type:");
            //TODO 1-2:scan pokemon type and save to a variable
            String type = scan.next();

            System.out.println("Enter pokemon's move name:");
            //TODO 1-3:scan pokemon move's name
            String move = scan.next();

            //TODO 2-1:create a new pokemon data from the above variables
            PokemonData newPokemon = new PokemonData(name, type, move);

            //TODO 2-2:add the pokemon data into pokedex
            pokedex.add(newPokemon);

            //TODO 4: Tricky part!! get the value from the type counting map , add 1 and put it back (multiple line
            int pokeCount = 1;
            if(typeCountMap.containsKey(type))
                typeCountMap.put(type, pokeCount+1);
            else
                typeCountMap.put(type, pokeCount);
        }

        //TODO 5 print out the created pokemon information (multiple line)
        for(PokemonData i : pokedex)
            System.out.println("name: " + i.name + ", type: " + i.type + ", move: " + i.move);

        //TODO 6 print out how many type of pokemons in the pokedex
        int mapSize = typeCountMap.size();
        System.out.println(mapSize);
    }
}
