package league_manager;

import league_manager.matches.Match;
import league_manager.matches.MatchRepository;
import league_manager.players.Player;
import league_manager.players.PlayerRepository;
import league_manager.teams.Team;
import league_manager.teams.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {

    @Autowired
    TeamRepository teamRepository;
    @Autowired
    PlayerRepository playerRepository;
    @Autowired
    MatchRepository matchRepository;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);

    }

    @Override
    public void run(String... args0) throws Exception {
        Team arsenal = teamRepository.save(new Team("Arsenal"));
        playerRepository.save(new Player("Ozil", arsenal));
        playerRepository.save(new Player("Sanchez", arsenal));

        Team manUtd = teamRepository.save(new Team("Manchester United"));
        playerRepository.save(new Player("Herrera", manUtd));
        playerRepository.save(new Player("Martial", manUtd));

        Team spurs = teamRepository.save(new Team("Tottenham Hotspur"));
        playerRepository.save(new Player("Kane", spurs));
        playerRepository.save(new Player("Eriksen", spurs));

        matchRepository.save(new Match(arsenal, manUtd));
        matchRepository.save(new Match(manUtd, spurs));
        matchRepository.save(new Match(spurs, arsenal));
    }
}
