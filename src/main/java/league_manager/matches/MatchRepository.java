package league_manager.matches;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "matches")
public interface MatchRepository extends JpaRepository<Match, Long> {

    List<Match> findByHomeTeamNameIgnoreCaseContaining(@Param("name") String name);
    List<Match> findByAwayTeamNameIgnoreCaseContaining(@Param("name") String name);
}
