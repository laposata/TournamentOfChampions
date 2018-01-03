package com.example.michaellaposata.tournamentofchampions.Champions;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

import com.example.michaellaposata.tournamentofchampions.Modifiers.Modifier;
import com.example.michaellaposata.tournamentofchampions.Potions.Potion;
import com.example.michaellaposata.tournamentofchampions.Tiles.Tile;
import com.example.michaellaposata.tournamentofchampions.Weapons.Weapon;

import java.util.ArrayList;

/**
 * Created by michaellaposata on 12/17/17.
 */

public abstract class Champion {
    protected Tile tile;
    protected int health;
    protected int maxHealth = 15;
    protected int mana;
    protected int maxMana = 3;
    protected int xp;
    protected int level;
    protected boolean alive;
    protected ArrayList<Weapon> weapons;
    protected ArrayList<Potion> potions;
    protected ArrayList<Modifier> effects;
    Champion(Tile tile) {
        this.tile = tile;
        this.tile.addChamp(this);
        this.health = maxHealth;
        this.mana = maxMana;
        this.xp = 0;
        this.level = 0;
        this.alive = false;
        this.weapons = new ArrayList<Weapon>();
        this.potions = new ArrayList<Potion>();
        this.effects = new ArrayList<Modifier>();
    }
    Champion() {
        this.health = maxHealth;
        this.mana = maxMana;
        this.xp = 0;
        this.level = 0;
        this.alive = false;
        this.weapons = new ArrayList<Weapon>();
        this.potions = new ArrayList<Potion>();
        this.effects = new ArrayList<Modifier>();
        this.tile = null;
    }
    public abstract Drawable getImage(Context c, ImageView iv);
    protected void calcBounds(Drawable dr) {
        int[] coords = this.tile.getPxCoords();
        int width = dr.getIntrinsicWidth();
        int height = dr.getIntrinsicHeight();
        dr.setBounds((coords[0] - width / 4),  (coords[1] - height / 4),
                (coords[0] + width / 4),
                (coords[1] + height / 4));
    }
    public boolean action(int cost) {
        if(mana > cost) {
            mana -= cost;
            return true;
        }
        return false;
    }

    public void heal(int h) {
        this.health = Math.min(this.health + h, this.maxHealth);
    }
    public void damage(int h) {
        this.health -= h;
        if(this.health <= 0) {
            this.alive = false;
        }
    }
    public boolean isAlone() {
        return tile.onTile.size() == 1;
    }
    public Tile getTile() {
        return this.tile;
    }
    public void setTile(Tile t) {
        this.tile = t;
        this.tile.addChamp(this);}
    public boolean isAlive() { return alive;}
    public void revive() {
        health = maxHealth;
        mana = maxMana;
        alive = true;
    }
}
