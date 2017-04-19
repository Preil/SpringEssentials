package com.oreilly.entities;

/**
 * Ilya 17.04.2017.
 */
public interface Game {

    void setHomeTeam(Team team);

    Team getHomeTeam();

    void setAwayTeam(Team team);

    Team getAwayTeam();

    String playGame();
}
