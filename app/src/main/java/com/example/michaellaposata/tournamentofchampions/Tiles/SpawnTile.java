package com.example.michaellaposata.tournamentofchampions.Tiles;

/**
 * Created by michaellaposata on 12/18/17.
 */

public class SpawnTile extends Tile {
    public SpawnTile(int x, int y, int radius) {
        super(x, y, radius);
    }
    public boolean spawnable() {
        return true;
    }

}
