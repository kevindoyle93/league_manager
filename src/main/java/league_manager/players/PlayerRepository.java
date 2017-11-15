package league_manager.players;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "players")
public interface PlayerRepository extends JpaRepository<Player, Long> {

    List<Player> findByName(@Param("name") String name);
    List<Player> findByNameIgnoreCaseContaining(@Param("name") String name);
}
