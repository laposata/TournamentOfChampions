package com.example.michaellaposata.tournamentofchampions.Modifiers;

import com.example.michaellaposata.tournamentofchampions.Champions.Champion;

/**
 * Created by michaellaposata on 12/17/17.
 */

public interface Modifier {
    public boolean hasExpired(Champion c);
    public int effect();
    public boolean effectsDamage();
    public boolean effectsMove();
    public boolean effectsCost();
}
