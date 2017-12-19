package com.example.michaellaposata.tournamentofchampions;

/**
 * Created by michaellaposata on 12/18/17.
 */

public class WellModifier implements Modifier {
    @Override
    public boolean hasExpired(Champion c) {
        if(c.health != c.maxHealth && c.isAlone()) {
            c.health = Math.min(c.health + 2, c.maxHealth);
        }
        return true;
    }

    @Override
    public int effect() {
        return 0;
    }

    @Override
    public boolean effectsDamage() {
        return false;
    }

    @Override
    public boolean effectsMove() {
        return false;
    }

    @Override
    public boolean effectsCost() {
        return false;
    }
}
