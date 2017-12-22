package com.example.michaellaposata.tournamentofchampions.Tiles;

import com.example.michaellaposata.tournamentofchampions.Modifiers.Modifier;
import com.example.michaellaposata.tournamentofchampions.Modifiers.HillModifier;

/**
 * Created by michaellaposata on 12/18/17.
 */

public class HillTile extends Tile {
    public HillTile(int x, int y, int radius) {
        super(x, y, radius);
    }
    public Modifier getSpecial() {
        return new HillModifier();
    }
}
