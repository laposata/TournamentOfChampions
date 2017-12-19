package com.example.michaellaposata.tournamentofchampions;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/**
 * Created by michaellaposata on 12/18/17.
 */

public class WellTile extends Tile {
    WellTile(int x, int y) {
        super(x, y);
    }
    public Modifier getSpecial() {
        return new WellModifier();
    }
    public int getDrawable() {
        return R.drawable.water;
    }
}
