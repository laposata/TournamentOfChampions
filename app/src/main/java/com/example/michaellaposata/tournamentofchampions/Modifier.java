package com.example.michaellaposata.tournamentofchampions;

/**
 * Created by michaellaposata on 12/17/17.
 */

public interface Modifier {
    boolean hasExpired(Champion c);
    int effect();
    boolean effectsDamage();
    boolean effectsMove();
    boolean effectsCost();
}
