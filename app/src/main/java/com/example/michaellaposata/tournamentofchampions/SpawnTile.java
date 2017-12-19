package com.example.michaellaposata.tournamentofchampions;

import android.content.Context;

/**
 * Created by michaellaposata on 12/18/17.
 */

public class SpawnTile extends Tile {
    SpawnTile(int x, int y) {
        super(x, y);
    }

    public int getDrawable() {
        return R.drawable.cultivatedfarmland;
    }

    public boolean spawnable() {
        return true;
    }

}
