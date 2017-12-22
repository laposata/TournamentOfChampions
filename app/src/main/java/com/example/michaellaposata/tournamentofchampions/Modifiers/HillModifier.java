package com.example.michaellaposata.tournamentofchampions.Modifiers;

import com.example.michaellaposata.tournamentofchampions.Champions.Champion;

/**
 * Created by michaellaposata on 12/18/17.
 */

public class HillModifier implements Modifier {
    @Override
    public boolean hasExpired(Champion c) {
        return true;
    }

    @Override
    public int effect() {
        return 1;
    }

    @Override
    public boolean effectsDamage() {
        return true;
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
