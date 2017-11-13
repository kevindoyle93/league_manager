package league_manager.teams;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    // For JPA
    public Team() {

    }

    public Team(String name) {
        this.name = name;
    }

    private String name;

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
