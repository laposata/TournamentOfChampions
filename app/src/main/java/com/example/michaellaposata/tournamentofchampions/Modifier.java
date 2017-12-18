package com.example.michaellaposata.tournamentofchampions;

/**
 * Created by michaellaposata on 12/17/17.
 */

public interface Modifier {
    boolean hasExpired();
    void effect();
    boolean effectsDamage();
    boolean effectsMove();
}
