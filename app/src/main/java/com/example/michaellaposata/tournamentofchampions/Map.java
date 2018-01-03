package com.example.michaellaposata.tournamentofchampions;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

import com.example.michaellaposata.tournamentofchampions.Champions.Champion;
import com.example.michaellaposata.tournamentofchampions.Champions.Warlock;
import com.example.michaellaposata.tournamentofchampions.Tiles.AcidTile;
import com.example.michaellaposata.tournamentofchampions.Tiles.ArmoryTile;
import com.example.michaellaposata.tournamentofchampions.Tiles.ChurchTile;
import com.example.michaellaposata.tournamentofchampions.Tiles.DojoTile;
import com.example.michaellaposata.tournamentofchampions.Tiles.HillTile;
import com.example.michaellaposata.tournamentofchampions.Tiles.LavaTile;
import com.example.michaellaposata.tournamentofchampions.Tiles.LibraryTile;
import com.example.michaellaposata.tournamentofchampions.Tiles.PotionShopTile;
import com.example.michaellaposata.tournamentofchampions.Tiles.RockTile;
import com.example.michaellaposata.tournamentofchampions.Tiles.SpawnTile;
import com.example.michaellaposata.tournamentofchampions.Tiles.Tile;
import com.example.michaellaposata.tournamentofchampions.Tiles.WellTile;

import java.util.ArrayList;


/**
 * Created by michaellaposata on 12/17/17.
 */

public class Map {
    public static final double MAP_WIDTH = 8.5;
    public static final double MAP_HEIGHT = 11.5;
    Tile center;
    ArrayList<Tile> tiles;
    Champion[] champions;
    int imageWidth;
    int imageHeight;
    Map(Champion[] champions){
        this.champions = champions;
        generateMap();

    }
    public void generateMap(){
        tiles = new ArrayList<Tile>();
        center = new WellTile(0,0);
        tiles.add(center);
        Tile[] layer;
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
        layer = new Tile[12];
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
        layer = new Tile[24];
        layer[0] = new RockTile(0,4);
        layer[1] = new Tile(1,3);
        layer[2] = new ArmoryTile(2,2);
        layer[3] = new Tile(3,1);
        layer[4] = new RockTile(4,0);
        layer[5] = new Tile(4,-1);
        layer[6] = new Tile(4, -2);
        layer[7] = new Tile(4, -3);
        layer[8] = new RockTile(4, -4);
        layer[9] = new Tile(3, -4);
        layer[10] = new HillTile(2, -4);
        layer[11] = new Tile(1,-4);
        layer[12] = new RockTile(0, -4);
        layer[13] = new Tile(-1, -3);
        layer[14] = new Tile(-2, -2);
        layer[15] = new PotionShopTile(-3, -1);
        layer[16] = new RockTile(-4, 0);
        layer[17] = new Tile(-4, 1);
        layer[18] = new Tile(-4, 2);
        layer[19] = new AcidTile(-4, 3);
        layer[20] = new RockTile(-4,4);
        layer[21] = new LibraryTile(-3, 4);
        layer[22] = new Tile(-2,4);
        layer[23] = new Tile(-1,4);
        for(Tile t: layer) {
            tiles.add(t);
        }
        layer = new Tile[30];
        layer[0] = new LavaTile(0,5);
        layer[1] = new RockTile(1,4);
        layer[2] = new AcidTile(2,3);
        layer[3] = new RockTile(3,2);
        layer[4] = new RockTile(4, 1);
        layer[5] = new LavaTile(5, 0);
        layer[6] = new RockTile(5,-1);
        layer[7] = new RockTile(5,-2);
        layer[8] = new RockTile(5,-3);
        layer[9] = new RockTile(5,-4);
        layer[10] = new LavaTile(5,-5);
        layer[11] = new RockTile(4,-5);
        layer[12] = new RockTile(3,-5);
        layer[13] = new RockTile(2,-5);
        layer[14] = new RockTile(1,-5);
        layer[15] = new LavaTile(0, -5);
        layer[16] = new RockTile(-1,-4);
        layer[17] = new RockTile(-2,-3);
        layer[18] = new AcidTile(-3,-2);
        layer[19] = new RockTile(-4, -1);
        layer[20] = new LavaTile(-5, 0);
        layer[21] = new RockTile(-5,1);
        layer[22] = new RockTile(-5,2);
        layer[23] = new RockTile(-5, 3);
        layer[24] = new RockTile(-5,4);
        layer[25] = new LavaTile(-5, 5);
        layer[26] = new RockTile(-4, 5);
        layer[27] = new RockTile(-3,5);
        layer[28] = new RockTile(-2,5);
        layer[29] = new RockTile(-1,5);
        for(Tile t: layer) {
            tiles.add(t);
        }
        layer = new Tile[18];
        layer[0] = new LavaTile(1,5);
        layer[1] = new LavaTile(2,4);
        layer[2] = new LavaTile(3,3);
        layer[3] = new LavaTile(4,2);
        layer[4] = new LavaTile(5, 1);
        layer[5] = new LavaTile(5,-6);
        layer[6] = new LavaTile(4,-6);
        layer[7] = new LavaTile(3,-6);
        layer[8] = new LavaTile(2,-6);
        layer[9] = new LavaTile(-2,-4);
        layer[10] = new LavaTile(-3, -3);
        layer[11] = new LavaTile(-4, -2);
        layer[12] = new LavaTile(-5,-1);

        layer[13] = new LavaTile(-5,6);
        layer[14] = new LavaTile(-4,6);
        layer[15] = new LavaTile(-3,6);
        layer[16] = new LavaTile(-2,6);
        layer[17] = new LavaTile(-1,6);
        for(Tile t: layer) {
           tiles.add(t);
        }
        layer = new Tile[10];
        layer[0] = new LavaTile(3,4);
        layer[1] = new LavaTile(4,3);
        layer[2] = new LavaTile(5,2);
        layer[3] = new LavaTile(5,-7);
        layer[4] = new LavaTile(4,-7);
        layer[5] = new LavaTile(-5,-2);
        layer[6] = new LavaTile(-4,-3);
        layer[7] = new LavaTile(-3,7);
        layer[8] = new LavaTile(-4,7);
        layer[9] = new LavaTile(-5,7);
        for(Tile t: layer) {
            tiles.add(t);
        }
        tiles.add(new LavaTile(5,3));
        tiles.add(new LavaTile(-5,8));
    }
    public Bitmap drawBaseMap(Context c) {
        Drawable map = c.getDrawable(R.drawable.map);
        map.setBounds(0,0, map.getIntrinsicWidth(), map.getIntrinsicHeight());
        Bitmap base = Bitmap.createBitmap(map.getIntrinsicWidth(),
                map.getIntrinsicHeight(),
                Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(base);
        map.draw(canvas);
        return base;
    }

    public Bitmap drawMap(Context c, ImageView iv, Bitmap map) {
        Canvas canvas = new Canvas(map);
        Drawable im;
        for (Champion champ : this.champions) {
            if(champ.isAlive()) {
                im = champ.getImage(c, iv);
                im.draw(canvas);
            }

        }

        return map;
    }
    public void addTileSize(int tileSize, int tchSize) {
        System.out.println(tileSize);
        for(Tile t: tiles) {
            t.setPxRadius(tileSize);
            t.setTchRadius(tchSize);
            if(t.spawnable()) {
                int[] coords = t.getTchCoords();
                System.out.println("Spawn:x " + coords[0] + " y " + coords[1]);
            }
        }
        imageHeight = (int)(tiles.get(0).lesserRadiusTch() * MAP_HEIGHT * 2);
        imageWidth = (int)(tchSize * Map.MAP_WIDTH * 2);
        System.out.println("actual: " + imageHeight + " " + imageWidth);

    }

    /**
     * finds which tile contains the point, returns null if none
     * @param x x coord of the point
     * @param y y coord of the point
     * @return the tile that contains the point, null if none
     */
    public Tile findTileByPoint(int x, int y) {
        for(Tile t: tiles) {
            if(t.inTile(x,y)){
                return t;
            }
        }
        return null;
    }

    public int getImageWidth() {
        return imageWidth;
    }
    public int getImageHeight() {
        return imageHeight;
    }
}
