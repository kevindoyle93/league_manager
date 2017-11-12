package league_manager;

import league_manager.teams.Team;

import java.util.concurrent.atomic.AtomicLong;

class DataMocker {

    static Team[] CREATE_MOCK_TEAMS() {

        AtomicLong teamIdCounter = new AtomicLong();

        return new Team[] {
            new Team(teamIdCounter.incrementAndGet(), "Arsenal"),
            new Team(teamIdCounter.incrementAndGet(), "Chelsea"),
            new Team(teamIdCounter.incrementAndGet(), "Liverpool"),
            new Team(teamIdCounter.incrementAndGet(), "Manchester City"),
            new Team(teamIdCounter.incrementAndGet(), "Manchester United"),
            new Team(teamIdCounter.incrementAndGet(), "Tottenham Hotspur"),
        };
    }
}
