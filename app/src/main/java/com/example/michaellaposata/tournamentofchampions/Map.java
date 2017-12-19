package com.example.michaellaposata.tournamentofchampions;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;

import java.util.ArrayList;


/**
 * Created by michaellaposata on 12/17/17.
 */

public class Map {
    static final int MAP_WIDTH = 10;
    static final int MAP_HEIGHT = 10;
    Tile center;
    ArrayList<Tile> tiles;
    Map(){
        generateMap();
    }
    public void generateMap(){
        tiles = new ArrayList<Tile>();
        center = new WellTile(0,0);
        tiles.add(center);
        Tile[] spawns = new Tile[6];
        spawns[0] = new SpawnTile(1,0);
        spawns[1] = new SpawnTile(1,-1);
        spawns[2] = new SpawnTile(0,-1);
        spawns[3] = new SpawnTile(-1,0);
        spawns[4] = new SpawnTile(-1,1);
        spawns[5] = new SpawnTile(0,1);
        for(Tile t: spawns){
            tiles.add(t);
        }
        Tile[] layer = new Tile[12];
        layer[0] = new Tile(0,2);
        layer[1] = new Tile(1,1);
        layer[2] = new Tile(2,0);
        layer[3] = new Tile(2,-1);
        layer[4] = new Tile(2,-2);
        layer[5] = new Tile(1,-2);
        layer[6] = new HillTile(0,-2);
        layer[7] = new Tile(-1,-1);
        layer[8] = new Tile(-2, 0);
        layer[9] = new Tile(-2, 1);
        layer[10] = new Tile(-2, 2);
        layer[11] = new Tile(-1,2);
        for(Tile t: layer) {
            tiles.add(t);
        }
        layer = new Tile[18];
        layer[0] = new Tile(0,3);
        layer[1] = new HillTile(1,2);
        layer[2] = new Tile(2,1);
        layer[3] = new Tile(3,0);
        layer[4] = new AcidTile(3,-1);
        layer[5] = new Tile(3, -2);
        layer[6] = new DojoTile(3, -3);
        layer[7] = new Tile(2,-3);
        layer[8] = new Tile(1, -3);
        layer[9] = new ChurchTile(0, -3);
        layer[10] = new Tile(-1,-2);
        layer[11] = new Tile(-2,-1);
        layer[12] = new Tile(-3,0);
        layer[13] = new HillTile(-3,1);
        layer[14] = new Tile(-3, 2);
        layer[15] = new Tile(-3,3);
        layer[16] = new Tile(-2,3);
        layer[17] = new ChurchTile(-1,3);
        for(Tile t: layer) {
            tiles.add(t);
        }


    }

}
