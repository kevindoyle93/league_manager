package league_manager.teams;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "teams")
public interface TeamRepository extends JpaRepository<Team, Long> {

    List<Team> findByName(@Param("name") String name);
    List<Team> findByNameIgnoreCaseContaining(@Param("name") String name);
}
