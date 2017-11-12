package league_manager;

import league_manager.teams.Team;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static Team[] TEAMS = DataMocker.CREATE_MOCK_TEAMS();

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
