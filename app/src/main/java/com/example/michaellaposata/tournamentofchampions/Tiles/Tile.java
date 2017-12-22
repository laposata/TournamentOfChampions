package com.example.michaellaposata.tournamentofchampions.Tiles;


import com.example.michaellaposata.tournamentofchampions.Champions.Champion;
import com.example.michaellaposata.tournamentofchampions.Map;
import com.example.michaellaposata.tournamentofchampions.Modifiers.Modifier;

import java.util.ArrayList;

/**
 * Created by michaellaposata on 12/17/17.
 */

public class Tile {
    public static final int RADIUS = 30;
    int x;
    int y;
    int z;
    public ArrayList<Champion> onTile;
    public Tile(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
        onTile = new ArrayList<Champion>();

    }
    public Tile(int x, int y) {
        this(x, y, -(x + y));
    }

    /**
     * calculates if the player is in range of their target
     * @param t the tile being targeted
     * @param dist the range of the action
     * @return boolean
     */
    public boolean inRange(Tile t, int dist) {
        int sum = Math.abs(t.x - this.x) + Math.abs(t.y - this.y) + Math.abs(t.z - this.z);
        return sum <= dist;

    }

    /**
     * returns if the player can spawn on this tile
     * @return false
     */
    public boolean spawnable() {
        return false;
    }

    /**
     * returns the modifier type that the tile applies.
     * this tile applies none
     * @return null
     */
    public Modifier getSpecial() {
        return null;
    }

    /**
     * Adds the champion to onTile
     * @param c the champion to be added to the list
     */
    public void addChamp(Champion c){
        onTile.add(c);
    }

    /**
     * removes the champion from onTile
     * @param c the champion to be removed
     */
    public void removeChamp(Champion c) {
        onTile.remove(c);
    }

    /**
     * returns the absolute x,y coordinates of the center of the tile
     * @return int[2] {x, y}
     */
    public int[] getTrueCoords(){
        int yCoord = RADIUS * 2 * y + RADIUS * x + RADIUS * Map.MAP_HEIGHT;
        int xCoord = RADIUS * 2 * x + RADIUS * (y + z) + RADIUS * Map.MAP_WIDTH;
        return new int[]{xCoord, yCoord};
    }

    /**
     * returns the x, y coordinates of all corners of the tile with the tiles center at {0,0}.
     * @return float[2][6] {ne, nw, e, se, sw, w}
     */
    public static float[][] getCorners() {
        //corners ne, nw, e, se, sw, w
        float[][] corners = new float[2][6];
        corners[0][0] = - (float)(RADIUS / (Math.tan(Math.PI/6.0)));
        corners[1][0] = (float)(RADIUS * (Math.cos(Math.PI/6.0)));
        corners[0][1] = (float)(RADIUS / (Math.tan(Math.PI/6.0)));
        corners[1][1] = (float)(RADIUS * (Math.cos(Math.PI/6.0)));
        corners[0][2] = RADIUS;
        corners[1][2] = 0;
        corners[0][3] = (float)(RADIUS / (Math.tan(Math.PI/6.0)));
        corners[1][3] = - (float)(RADIUS * (Math.cos(Math.PI/6.0)));
        corners[0][4] = - (float)(RADIUS / (Math.tan(Math.PI/6.0)));
        corners[1][4] = - (float)(RADIUS * (Math.cos(Math.PI/6.0)));
        corners[0][5] = - RADIUS;
        corners[1][5] = 0;
        return corners;
    }


}
