package com.example.michaellaposata.tournamentofchampions;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Display;
import android.view.MotionEvent;
import android.widget.ImageView;

import com.example.michaellaposata.tournamentofchampions.Champions.Champion;
import com.example.michaellaposata.tournamentofchampions.Champions.Monk;
import com.example.michaellaposata.tournamentofchampions.Tiles.Tile;

public class Board extends AppCompatActivity {
    Map map;
    Champion[] champions;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_board);

        champions = new Champion[1];
        champions[0] = new Monk();
        this.map = new Map(champions);
        Bitmap b = map.drawBaseMap(this);
        ImageView iv = findViewById(R.id.mapView);

        draw();
        Display d =  getWindowManager().getDefaultDisplay();
        int w = d.getWidth();
        int h = d.getHeight() / 2;
        iv.setMaxHeight(h);
        iv.setMaxWidth(w);
        map.addTileSize((int)(b.getWidth()/ (Map.MAP_WIDTH * 2)),
                (int)(getMaxDimension(h,w)? (h)/ (Map.MAP_HEIGHT * 2):(w)/ (Map.MAP_WIDTH * 2)));
        draw();

    }

    public boolean onTouchEvent(MotionEvent e){
        Display d =  getWindowManager().getDefaultDisplay();
        int w = d.getWidth();
        int h = d.getHeight() / 2;
        System.out.println("screen" + w+ "  " + h);
        boolean offset = getMaxDimension(h,w);
        System.out.println("touch"+ e.getX() + " " + e.getY());
        int x = (int)(offset? e.getX() : e.getX() + getImageOffsetH(h));
        int y = (int)(offset? e.getY() + getImageOffsetW(w): e.getY());
        System.out.println("scaled" + x + " " + y);
        Tile on;
        if(!champions[0].isAlive()){
           on = map.findTileByPoint((int) e.getX(), (int) e.getY());
           if(on != null && on.spawnable()) {
               System.out.println("on Coords" + on.toString());
               champions[0].setTile(on);
               champions[0].revive();
               draw();

           }
        }
        champions[0].damage(100);
        return true;
    }

    public void draw(){
        ImageView iv = findViewById(R.id.mapView);
        Bitmap b = map.drawBaseMap(this);
        iv.setImageBitmap(map.drawMap(this, iv, b));
    }

    /**
     * returns the dimension that the map image will be drawn to fully
     * @param height the max Height to be drawn to
     * @param width the max width to be drawn to
     * @return true if height is the max dimension, false if width
     */
    public boolean getMaxDimension(int height, int width) {
        Drawable im = this.getDrawable(R.drawable.map);
        int imHeight = im.getIntrinsicHeight();
        int imWidth = im.getIntrinsicWidth();

        double scaledHeight = height / imHeight;
        double scaledWidth = width / imWidth;
        return scaledHeight < scaledWidth;
    }

    private int getImageOffsetW(int width) {

        return (width - map.getImageWidth()) / 2;
    }
    private int getImageOffsetH(int height) {

        return (height - map.getImageHeight()) / 2;
    }
}
