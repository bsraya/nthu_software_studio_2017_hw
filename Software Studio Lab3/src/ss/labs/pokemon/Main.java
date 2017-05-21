package ss.labs.pokemon;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.*;
//TODO: Practice3-1
public class Main {

    public static void main(String[] args) {

        //TODO: Create a pokedex and load json data
        Pokedex pokedex = new Pokedex("bin/pokedex.json");
        //TODO: Enable user input to key in pokemon species data.
        Scanner scanner = new Scanner(System.in);
        //TODO: You can use a loop to get multiple entries of data
        while(true)
        {
            int[] speciesValue = new int[6];
            System.out.println("Enter pokemon ID : ");
            int pokemonID = scanner.nextInt();

            System.out.println("Enter pokemon's name : ");
            String pokemonName = scanner.next();

            System.out.println("Enter species value : ");
            for(int i=0;i<6;i++)
                speciesValue[i] = scanner.nextInt();

            pokedex.addNewPokemon(pokemonID, pokemonName, speciesValue);
            System.out.println("quit game? yes or no");
            String input = scanner.next();
            if(input.equals("yes"))
                break;
        }

        //TODO: Well, one entry is fine if you are lazy~
        try{
            pokedex.saveFile("pokedex_practice.json");
        } catch(IOException e){
            e.printStackTrace();
        }

        //TODO: save file into pokedex_practice.json

    }
}
