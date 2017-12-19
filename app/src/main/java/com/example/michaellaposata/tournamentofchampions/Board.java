package com.example.michaellaposata.tournamentofchampions;

import android.content.Intent;
import android.graphics.drawable.BitmapDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class Board extends AppCompatActivity {
    Map map;
    Character[] characters;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_board);
        System.out.println("Draw3");
        ImageView iv = findViewById(R.id.mapView);
        this.map = new Map();
        iv.setImageResource(R.drawable.map);
        Intent intent = getIntent();
        characters = new Character[1];
        characters[0] = new Monk();
    }


}
