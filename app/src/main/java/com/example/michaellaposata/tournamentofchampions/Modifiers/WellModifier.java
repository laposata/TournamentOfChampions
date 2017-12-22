package com.example.michaellaposata.tournamentofchampions.Modifiers;

import com.example.michaellaposata.tournamentofchampions.Champions.Champion;

/**
 * Created by michaellaposata on 12/18/17.
 */

public class WellModifier implements Modifier {
    @Override
    public boolean hasExpired(Champion c) {
        if(c.isAlone()) {
           c.heal(2);
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
