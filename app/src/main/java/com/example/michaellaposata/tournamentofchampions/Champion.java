package com.example.michaellaposata.tournamentofchampions;

import java.util.ArrayList;

/**
 * Created by michaellaposata on 12/17/17.
 */

public abstract class Champion {
    Tile tile;
    int health;
    int maxHealth = 15;
    int mana;
    int maxMana = 3;
    int xp;
    int level;
    boolean alive;
    ArrayList<Weapon> weapons;
    ArrayList<Potion> potions;
    ArrayList<Modifier> effects;
    Champion(Tile tile) {
        this.tile = tile;
        this.health = maxHealth;
        this.mana = maxMana;
        this.xp = 0;
        this.level = 0;
        this.alive = true;
        this.weapons = new ArrayList<Weapon>();
        this.potions = new ArrayList<Potion>();
        this.effects = new ArrayList<Modifier>();

    }

    public boolean action(int cost) {
        if(mana > cost) {
            mana -= cost;
            return true;
        }
        return false;
    }

    public boolean isAlone() {
        return tile.onTile.size() == 1;
    }

}
