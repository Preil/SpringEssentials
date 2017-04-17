package entities;

/**
 * Ilya 17.04.2017.
 */
public class BaseballGame implements Game {
    private Team homeTeam;
    private Team awayTeam;

    public BaseballGame() {
    }

    public BaseballGame(Team homeTeam, Team awayTeam) {
        this.awayTeam = awayTeam;
        this.homeTeam = homeTeam;
    }

    public void setHomeTeam(Team team) {
        homeTeam = team;
    }

    public Team getHomeTeam() {
        return homeTeam;
    }

    public void setAwayTeam(Team team) {
        awayTeam = team;
    }

    public Team getAwayTeam() {
        return awayTeam;
    }

    public String playGame() {
        return Math.random() < 0.5 ? getHomeTeam().getName() : getAwayTeam().getName();
    }
}
