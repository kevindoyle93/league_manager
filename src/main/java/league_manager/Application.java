package league_manager;

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

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);

    }

    @Override
    public void run(String... args0) throws Exception {
        teamRepository.save(new Team("Arsenal"));
        teamRepository.save(new Team("Bournemouth"));
        teamRepository.save(new Team("Brighton & Hove Albion"));
        teamRepository.save(new Team("Burnley"));
        teamRepository.save(new Team("Chelsea"));
        teamRepository.save(new Team("Crystal Palace"));
        teamRepository.save(new Team("Everton"));
        teamRepository.save(new Team("Huddersfield Town"));
        teamRepository.save(new Team("Leicester City"));
        teamRepository.save(new Team("Liverpool"));
        teamRepository.save(new Team("Manchester City"));
        teamRepository.save(new Team("Manchester United"));
        teamRepository.save(new Team("Newcastle United"));
        teamRepository.save(new Team("Southampton"));
        teamRepository.save(new Team("Stoke City"));
        teamRepository.save(new Team("Swansea City"));
        teamRepository.save(new Team("Tottenham Hotspur"));
        teamRepository.save(new Team("Watford"));
        teamRepository.save(new Team("West Bromwich Albion"));
        teamRepository.save(new Team("West Ham United"));
    }
}
