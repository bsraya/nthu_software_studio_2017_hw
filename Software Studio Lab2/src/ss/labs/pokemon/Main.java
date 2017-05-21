package ss.labs.pokemon;

import ss.labs.pokemon.character.NPC;
import ss.labs.pokemon.character.NPCGenerator;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	    //TODO create a character generator
        NPCGenerator character = new NPCGenerator();
        //TODO get all characters from character generator
        ArrayList<NPC> npcList = character.getNpcTemplates();
        //TODO print out characters' information, you can choose to use toString or showDescription
        for(NPC npc: npcList)
            npc.showInformation();
    }
}
