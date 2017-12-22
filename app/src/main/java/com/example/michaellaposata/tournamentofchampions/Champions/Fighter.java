package com.example.michaellaposata.tournamentofchampions.Champions;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

import com.example.michaellaposata.tournamentofchampions.Tiles.Tile;

/**
 * Created by michaellaposata on 12/19/17.
 */

public class Fighter extends Champion {
    Fighter(Tile tile) {
        super(tile);
    }

    @Override
    public Drawable getImage(Context c, ImageView iv) {
        return null;
    }
}
