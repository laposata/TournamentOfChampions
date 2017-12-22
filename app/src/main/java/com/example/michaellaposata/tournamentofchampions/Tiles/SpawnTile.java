package com.example.michaellaposata.tournamentofchampions.Tiles;

import com.example.michaellaposata.tournamentofchampions.R;
import com.example.michaellaposata.tournamentofchampions.Tiles.Tile;

/**
 * Created by michaellaposata on 12/18/17.
 */

public class SpawnTile extends Tile {
    public SpawnTile(int x, int y) {
        super(x, y);
    }

    public boolean spawnable() {
        return true;
    }

}
