
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Group {

    String groupName;
    Team[] teams = new Team[4];
    List<Match> matches = new ArrayList<>();

    public Group(String groupName, Team[] teams) {
        this.groupName = groupName;
        this.teams = teams;
    }

    public void createMatches() {
        for (int i = 0; i < teams.length; i++) {
            for (int j = i + 1; j < teams.length; j++) {
                matches.add(new Match(teams[i], teams[j]));
                matches.add(new Match(teams[j], teams[i])); // Reverse for home and away
            }
        }

        for (Match match : matches) {
            match.simulateMatch();
        }

    }

    public Team[] getQualifiedTeams() {
        Arrays.sort(teams, Comparator.comparingInt((Team t) -> t.getPoints()).thenComparingInt(t -> t.getGoalsScored()).reversed());
        return new Team[]{teams[0], teams[1]};
    }
}
