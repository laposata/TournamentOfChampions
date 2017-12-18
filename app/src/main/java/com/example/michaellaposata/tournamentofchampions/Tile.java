package com.example.michaellaposata.tournamentofchampions;

/**
 * Created by michaellaposata on 12/17/17.
 */

public abstract class Tile {
    //orientation {N, NE, SE, S, SW, NW}
    Tile[] adjacent;
    public boolean inRange(Tile t, int dist) {
        if(dist == 0) {
            return this.equals(t);
        } else {
            for(Tile n: adjacent){
                if(n.inRange(t, dist - 1)){
                    return true;
                }
            }
            return false;
        }
    }
}
