package com.example.michaellaposata.tournamentofchampions;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

import com.example.michaellaposata.tournamentofchampions.Champions.Champion;
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
    public static final double MAP_WIDTH = 11;
    public static final double MAP_HEIGHT = 11.5;
    Tile center;
    ArrayList<Tile> tiles;
    Champion[] champions;
    Map(Champion[] champions, int totalHeight){
        this.champions = champions;

        int tileSize = (int)(totalHeight / (MAP_HEIGHT * 4));
        System.out.println(tileSize);
        generateMap(tileSize);

    }
    public void generateMap(int tileSize){
        tiles = new ArrayList<Tile>();
        center = new WellTile(0,0, tileSize);
        tiles.add(center);
        Tile[] spawns = new Tile[6];
        spawns[0] = new SpawnTile(1,0, tileSize);
        spawns[1] = new SpawnTile(1,-1, tileSize);
        spawns[2] = new SpawnTile(0,-1, tileSize);
        spawns[3] = new SpawnTile(-1,0, tileSize);
        spawns[4] = new SpawnTile(-1,1, tileSize);
        spawns[5] = new SpawnTile(0,1, tileSize);
        for(Tile t: spawns){
            tiles.add(t);
        }
        Tile[] layer = new Tile[12];
        layer[0] = new Tile(0,2, tileSize);
        layer[1] = new Tile(1,1, tileSize);
        layer[2] = new Tile(2,0, tileSize);
        layer[3] = new Tile(2,-1, tileSize);
        layer[4] = new Tile(2,-2, tileSize);
        layer[5] = new Tile(1,-2, tileSize);
        layer[6] = new HillTile(0,-2, tileSize);
        layer[7] = new Tile(-1,-1, tileSize);
        layer[8] = new Tile(-2, 0, tileSize);
        layer[9] = new Tile(-2, 1, tileSize);
        layer[10] = new Tile(-2, 2, tileSize);
        layer[11] = new Tile(-1,2, tileSize);
        for(Tile t: layer) {
            tiles.add(t);
        }
        layer = new Tile[18];
        layer[0] = new Tile(0,3, tileSize);
        layer[1] = new HillTile(1,2, tileSize);
        layer[2] = new Tile(2,1, tileSize);
        layer[3] = new Tile(3,0, tileSize );
        layer[4] = new AcidTile(3,-1, tileSize);
        layer[5] = new Tile(3, -2, tileSize);
        layer[6] = new DojoTile(3, -3, tileSize);
        layer[7] = new Tile(2,-3, tileSize );
        layer[8] = new Tile(1, -3, tileSize );
        layer[9] = new ChurchTile(0, -3, tileSize);
        layer[10] = new Tile(-1,-2, tileSize );
        layer[11] = new Tile(-2,-1, tileSize );
        layer[12] = new Tile(-3,0, tileSize );
        layer[13] = new HillTile(-3,1, tileSize);
        layer[14] = new Tile(-3, 2, tileSize );
        layer[15] = new Tile(-3,3, tileSize );
        layer[16] = new Tile(-2,3, tileSize );
        layer[17] = new ChurchTile(-1,3, tileSize);
        for(Tile t: layer) {
            tiles.add(t);
        }
        layer = new Tile[24];
        layer[0] = new RockTile(0,4, tileSize);
        layer[1] = new Tile(1,3, tileSize);
        layer[2] = new ArmoryTile(2,2, tileSize);
        layer[3] = new Tile(3,1, tileSize );
        layer[4] = new RockTile(4,0, tileSize);
        layer[5] = new Tile(4,-1, tileSize );
        layer[6] = new Tile(4, -2, tileSize );
        layer[7] = new Tile(4, -3, tileSize );
        layer[8] = new RockTile(4, -4, tileSize);
        layer[9] = new Tile(3, -4, tileSize );
        layer[10] = new HillTile(2, -4, tileSize);
        layer[11] = new Tile(1,-4, tileSize );
        layer[12] = new RockTile(0, -4, tileSize);
        layer[13] = new Tile(-1, -3, tileSize );
        layer[14] = new Tile(-2, -2, tileSize );
        layer[15] = new PotionShopTile(-3, -1, tileSize);
        layer[16] = new RockTile(-4, 0, tileSize);
        layer[17] = new Tile(-4, 1, tileSize );
        layer[18] = new Tile(-4, 2, tileSize );
        layer[19] = new AcidTile(-4, 3, tileSize);
        layer[20] = new RockTile(-4,4, tileSize);
        layer[21] = new LibraryTile(-3, 4, tileSize);
        layer[22] = new Tile(-2,4, tileSize );
        layer[23] = new Tile(-1,4, tileSize );
        for(Tile t: layer) {
            tiles.add(t);
        }
        layer = new Tile[30];
        layer[0] = new LavaTile(0,5, tileSize);
        layer[1] = new RockTile(1,4, tileSize);
        layer[2] = new AcidTile(2,3, tileSize);
        layer[3] = new RockTile(3,2, tileSize);
        layer[4] = new RockTile(4, 1, tileSize);
        layer[5] = new LavaTile(5, 0, tileSize);
        layer[6] = new RockTile(5,-1, tileSize);
        layer[7] = new RockTile(5,-2, tileSize);
        layer[8] = new RockTile(5,-3, tileSize);
        layer[9] = new RockTile(5,-4, tileSize);
        layer[10] = new LavaTile(5,-5, tileSize);
        layer[11] = new RockTile(4,-5, tileSize);
        layer[12] = new RockTile(3,-5, tileSize);
        layer[13] = new RockTile(2,-5, tileSize);
        layer[14] = new RockTile(1,-5, tileSize);
        layer[15] = new LavaTile(0, -5, tileSize);
        layer[16] = new RockTile(-1,-4, tileSize);
        layer[17] = new RockTile(-2,-3, tileSize);
        layer[18] = new AcidTile(-3,-2, tileSize);
        layer[19] = new RockTile(-4, -1, tileSize);
        layer[20] = new LavaTile(-5, 0, tileSize);
        layer[21] = new RockTile(-5,1, tileSize);
        layer[22] = new RockTile(-5,2, tileSize);
        layer[23] = new RockTile(-5, 3, tileSize);
        layer[24] = new RockTile(-5,4, tileSize);
        layer[25] = new LavaTile(-5, 5, tileSize);
        layer[26] = new RockTile(-4, 5, tileSize);
        layer[27] = new RockTile(-3,5, tileSize);
        layer[28] = new RockTile(-2,5, tileSize);
        layer[29] = new RockTile(-1,5, tileSize);
        for(Tile t: layer) {
            tiles.add(t);
        }
        layer = new Tile[18];
        layer[0] = new LavaTile(1,5, tileSize);
        layer[1] = new LavaTile(2,4, tileSize);
        layer[2] = new LavaTile(3,3, tileSize);
        layer[3] = new LavaTile(4,2, tileSize);
        layer[4] = new LavaTile(5, 1, tileSize);
        layer[5] = new LavaTile(5,-6, tileSize);
        layer[6] = new LavaTile(4,-6, tileSize);
        layer[7] = new LavaTile(3,-6, tileSize);
        layer[8] = new LavaTile(2,-6, tileSize);
        layer[9] = new LavaTile(-2,-4, tileSize);
        layer[10] = new LavaTile(-3, -3, tileSize);
        layer[11] = new LavaTile(-4, -2, tileSize);
        layer[12] = new LavaTile(-5,-1, tileSize);
        layer[13] = new LavaTile(6,-5, tileSize);
        layer[14] = new LavaTile(6,-4, tileSize);
        layer[15] = new LavaTile(6, -3, tileSize);
        layer[16] = new LavaTile(6,-2, tileSize);
        layer[17] = new LavaTile(6,-1, tileSize);
        for(Tile t: layer) {
            tiles.add(t);
        }
        layer = new Tile[10];
        layer[0] = new LavaTile(3,4, tileSize);
        layer[1] = new LavaTile(4,4, tileSize);
        layer[2] = new LavaTile(5,3, tileSize);
        layer[3] = new LavaTile(5,-7, tileSize);
        layer[4] = new LavaTile(4,-7, tileSize);
        layer[5] = new LavaTile(-5,-2, tileSize);
        layer[6] = new LavaTile(-4,-3, tileSize);
        layer[7] = new LavaTile(-3,7, tileSize);
        layer[8] = new LavaTile(-4,7, tileSize);
        layer[9] = new LavaTile(-5,7, tileSize);
        for(Tile t: layer) {
            tiles.add(t);
        }
    }
    public Bitmap drawMap(Context c, ImageView iv) {
        Drawable map = c.getDrawable(R.drawable.map);
        map.setBounds(0,0, map.getIntrinsicWidth(), map.getIntrinsicHeight());
        Bitmap base = Bitmap.createBitmap(map.getIntrinsicWidth(),
                map.getIntrinsicHeight(),
                Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(base);
        map.draw(canvas);
        for (Champion champ : this.champions) {
            Drawable im = champ.getImage(c, iv);
            im.draw(canvas);
        }
        System.out.println("TFS");
        return base;
    }
}
