package com.example.michaellaposata.tournamentofchampions;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.example.michaellaposata.tournamentofchampions.Champions.Champion;
import com.example.michaellaposata.tournamentofchampions.Champions.Monk;
import com.example.michaellaposata.tournamentofchampions.Champions.Warlock;

public class Board extends AppCompatActivity {
    Map map;
    Champion[] champions;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_board);
        ImageView iv = findViewById(R.id.mapView);
        champions = new Champion[2];
        this.map = new Map(champions, this.getDrawable(R.drawable.map).getIntrinsicHeight());
        champions[0] = new Monk(map.tiles.get(2));
        champions[1] = new Warlock(map.tiles.get(3));
        System.out.println("Draw map");
        iv.setImageBitmap(map.drawMap(this, iv));
        //iv.setImageDrawable(this.getDrawable(R.drawable.map));



    }


}
