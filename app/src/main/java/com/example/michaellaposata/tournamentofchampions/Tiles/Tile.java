package com.example.michaellaposata.tournamentofchampions.Tiles;


import com.example.michaellaposata.tournamentofchampions.Champions.Champion;
import com.example.michaellaposata.tournamentofchampions.Map;
import com.example.michaellaposata.tournamentofchampions.Modifiers.Modifier;

import java.util.ArrayList;

/**
 * Created by michaellaposata on 12/17/17.
 */

public class Tile {
    int pxRadius = 30;
    int tchRadius;
    int x;
    int y;
    int z;

    public ArrayList<Champion> onTile;
    public Tile(int x, int y, int z, int radius) {
        this.x = x;
        this.y = y;
        this.z = z;
        onTile = new ArrayList<Champion>();
        this.pxRadius = radius;

    }
    public Tile(int x, int y, int radius) {
        this(x, y, -(x + y), radius);
    }
    public Tile(int x, int y) {this(x, y, -(x + y), 0);}

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
     * returns the absolute x,y coordinates of the center of the tile for drawing
     * @return int[2] {x, y}
     */
    public int[] getPxCoords(){
        double height = lesserRadiusPx();
        int yCoord =(int)(-(height * y * 2 + height * x ) + height * (Map.MAP_HEIGHT + 1));
        int xCoord = (int)(pxRadius * x * 3/2 + pxRadius * Map.MAP_WIDTH);
        return new int[]{xCoord, yCoord};
    }

    /**
     * returns the absolute x,y coordinates of the center of the tile for touch
     * @return int[2] {x, y}
     */
    public int[] getTchCoords(){
        double height = lesserRadiusTch();
        int yCoord =(int)(-(height * y * 2 + height * x ) + height * (Map.MAP_HEIGHT + 1));
        int xCoord = (int)(tchRadius * x * 3/2 + tchRadius * Map.MAP_WIDTH);
        return new int[]{xCoord, yCoord};
    }

    /***
     * returns the distance between the center and half way to a side for drawing
     * @return the lesser radius of the hex
     */
    public double lesserRadiusPx() {
        return (pxRadius * (Math.cos(Math.PI/6.0)));
    }

    /***
     * returns the distance between the center and half way to a side for touch
     * @return the lesser radius of the hex for touch
     */
    public double lesserRadiusTch() {
        return (tchRadius * (Math.cos(Math.PI/6.0)));
    }
    /**
     * outputs if the point is inside a circle with the lesser radius of the hex
     * @param x x coord of the point
     * @param y y coord of the point
     * @return if the point is in the circle
     */
    public boolean inTile(int x, int y) {
        int[] coords = this.getTchCoords();
        return Math.pow(x - coords[0], 2) + Math.pow(y - coords[1], 2)
                <= Math.pow(lesserRadiusTch(), 2);
    }

    /**
     * sets this.pxRadius to the input
     * @param pxRadius the new pxRadius
     */
    public void setPxRadius(int pxRadius) {
        this.pxRadius = pxRadius;
    }

    /**
     * sets this.tchRadius to the input
     * @param tchRadius the new tchRadius
     */
    public void setTchRadius(int tchRadius) {
        this.tchRadius = tchRadius;
    }
    public String toString(){
        int[] tchCoords = this.getTchCoords();
        return "x: "+ this.x + " y: " + this.y+ " z: " + this.z+ "\n"
                +"tchX: " + tchCoords[0] +" tchY: " +tchCoords[1];
    }

}
