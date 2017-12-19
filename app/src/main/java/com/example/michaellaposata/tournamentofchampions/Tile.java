package com.example.michaellaposata.tournamentofchampions;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Path;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;


import java.util.ArrayList;

/**
 * Created by michaellaposata on 12/17/17.
 */

public class Tile {
    static final int RADIUS = 30;
    //orientation {N, NE, SE, S, SW, NW}
    int x;
    int y;
    int z;
    ArrayList<Champion> onTile;
    Tile(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
        onTile = new ArrayList<Champion>();

    }
    Tile(int x, int y) {
        this(x, y, -(x + y));
    }

    public boolean inRange(Tile t, int dist) {
        int sum = Math.abs(t.x - this.x) + Math.abs(t.y - this.y) + Math.abs(t.z - this.z);
        return sum <= dist;
    }

    public boolean spawnable() {
        return false;
    }
    public Modifier getSpecial() {
        return null;
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
