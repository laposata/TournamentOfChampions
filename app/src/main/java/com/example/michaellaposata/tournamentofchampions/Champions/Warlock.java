package com.example.michaellaposata.tournamentofchampions.Champions;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

import com.example.michaellaposata.tournamentofchampions.R;
import com.example.michaellaposata.tournamentofchampions.Tiles.Tile;

/**
 * Created by michaellaposata on 12/19/17.
 */

public class Warlock extends Champion {
    public Warlock(Tile tile) {
        super(tile);
    }
    public Warlock() {
        super();
    }

    @Override
    public Drawable getImage(Context c, ImageView iv) {
        Drawable dr = c.getDrawable(R.drawable.warlock);
        this.calcBounds(dr);
        return dr;
    }
}
