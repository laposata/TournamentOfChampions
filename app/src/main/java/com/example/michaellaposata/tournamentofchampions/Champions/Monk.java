package com.example.michaellaposata.tournamentofchampions.Champions;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

import com.example.michaellaposata.tournamentofchampions.R;
import com.example.michaellaposata.tournamentofchampions.Tiles.Tile;

/**
 * Created by michaellaposata on 12/19/17.
 */

public class Monk extends Champion {
    public Monk(Tile tile) {
        super(tile);
        this.maxMana = 4;
        this.mana = 4;
    }
    public Monk() {
        super();
        this.maxMana = 4;
        this.mana = 4;
    }

    @Override
    public Drawable getImage(Context c, ImageView iv) {
        Drawable dr = c.getDrawable(R.drawable.monk);
        this.calcBounds(dr);
        return dr;
    }
}
