package league_manager.matches;

import league_manager.teams.Team;

import javax.persistence.*;

@Entity
public class Match {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    private Team homeTeam;

    @ManyToOne
    private Team awayTeam;

    private int homeTeamFullTimeGoals;

    private int awayTeamFullTimeGoals;

    public Match() {

    }

    public Match(Team homeTeam, Team awayTeam) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Team getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(Team homeTeam) {
        this.homeTeam = homeTeam;
    }

    public Team getAwayTeam() {
        return awayTeam;
    }

    public void setAwayTeam(Team awayTeam) {
        this.awayTeam = awayTeam;
    }

    public int getHomeTeamFullTimeGoals() {
        return homeTeamFullTimeGoals;
    }

    public void setHomeTeamFullTimeGoals(int homeTeamFullTimeGoals) {
        this.homeTeamFullTimeGoals = homeTeamFullTimeGoals;
    }

    public int getAwayTeamFullTimeGoals() {
        return awayTeamFullTimeGoals;
    }

    public void setAwayTeamFullTimeGoals(int awayTeamFullTimeGoals) {
        this.awayTeamFullTimeGoals = awayTeamFullTimeGoals;
    }
}
