package league_manager.teams;

public class Team {

    private final long id;

    private String name;

    public Team(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}