package league_manager.teams;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "teams")
public interface TeamRepository extends PagingAndSortingRepository<Team, Long> {

    List<Team> findByName(@Param("name") String name);
}