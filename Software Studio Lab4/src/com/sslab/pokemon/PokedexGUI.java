package com.sslab.pokemon;

import com.sslab.pokemon.sprite.PokemonSprite;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 * Created by jerry on 2017/3/19.
 */
public class PokedexGUI {
    private JLabel hpLabel;
    private JLabel attackLabel;
    private JLabel defenseLabel;
    private JComboBox speciesComboBox;
    private JPanel root;
    private JLabel imageLabel;
    private JLabel spatkLabel;
    private JLabel spdefLabel;
    private JLabel speedLabel;
    private JLabel nameLabel;
    private JLabel typeLabel;

    private ArrayList<JLabel> statLabels;
    Pokedex pokedex;
    public PokedexGUI(){
        statLabels = new ArrayList<>();
        //TODO: Add the "stat" labels into statLabels
        statLabels.add(hpLabel);
        statLabels.add(attackLabel);
        statLabels.add(defenseLabel);
        statLabels.add(spatkLabel);
        statLabels.add(spdefLabel);
        statLabels.add(speedLabel);

        //TODO: Use Pokedex to get pokemon species data
        pokedex = new Pokedex("bin/pokemonData.json");

        //TODO: Add items into combobox. Each item should be a concat string of pokemon id and name from pokedex
        for(int i =0; i<pokedex.getPokemonSize();i++)
            speciesComboBox.addItem(i + ": " + pokedex.getPokemonData(i).getSpeciesName());

        speciesComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //TODO update fields when select items in combobox
                int id = speciesComboBox.getSelectedIndex();
                for(int i = 0; i < statLabels.size(); i++)
                    statLabels.get(i).setText(Integer.toString(pokedex.getPokemonData(id).getSpeciesValue().getValArray()[i]));

                nameLabel.setText(pokedex.getPokemonData(id).getSpeciesName());
                typeLabel.setText(pokedex.getPokemonData(id).getType());
                setPokemonIcon(id, imageLabel);
            }
        });
    }

    //set the icon of a label of pokemon according to the id
    private void setPokemonIcon(int id,JLabel label)
    {
        ImageIcon icon = new ImageIcon(PokemonSprite.getSprite(id));
        label.setIcon(icon);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("PokedexGUI");
        frame.setContentPane(new PokedexGUI().root);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}

