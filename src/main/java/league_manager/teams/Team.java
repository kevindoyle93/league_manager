package league_manager.teams;

import league_manager.matches.Match;
import league_manager.players.Player;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String name;

    @OneToMany(mappedBy = "team")
    private List<Player> squad;

    @OneToMany(mappedBy = "homeTeam")
    private List<Match> homeMatches;

    @OneToMany(mappedBy = "awayTeam")
    private List<Match> awayMatches;

    // For JPA
    public Team() {

    }

    public Team(String name) {
        this.name = name;
        this.squad = new ArrayList<>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Player> getSquad() {
        return squad;
    }

    public void setSquad(List<Player> squad) {
        this.squad = squad;
    }
}
