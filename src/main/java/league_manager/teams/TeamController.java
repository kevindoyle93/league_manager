package league_manager.teams;

import league_manager.Application;
import org.springframework.web.bind.annotation.*;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController()
public class TeamController {

    @RequestMapping(value = "/teams", method = GET)
    public Team[] getAllTeams() {
        return Application.TEAMS;
    }

    @RequestMapping(value = "/teams/{id}", method = GET)
    public Team getTeam(@PathVariable("id") int id) {
        return Application.TEAMS[id];
    }
}
