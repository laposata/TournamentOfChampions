package com.example.michaellaposata.tournamentofchampions.Tiles;

import com.example.michaellaposata.tournamentofchampions.Modifiers.Modifier;
import com.example.michaellaposata.tournamentofchampions.R;
import com.example.michaellaposata.tournamentofchampions.Modifiers.WellModifier;

/**
 * Created by michaellaposata on 12/18/17.
 */

public class WellTile extends Tile {
    public WellTile(int x, int y) {
        super(x, y);
    }
    public Modifier getSpecial() {
        return new WellModifier();
    }
    public int getDrawable() {
        return R.drawable.water;
    }
}
