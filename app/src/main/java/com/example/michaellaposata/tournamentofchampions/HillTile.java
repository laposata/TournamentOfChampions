package com.example.michaellaposata.tournamentofchampions;

/**
 * Created by michaellaposata on 12/18/17.
 */

public class HillTile extends Tile {
    HillTile(int x, int y) {
        super(x, y);
    }
    public Modifier getSpecial() {
        return new HillModifier();
    }
}
