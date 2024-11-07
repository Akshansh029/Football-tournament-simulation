
public class Match {

    Team team1;
    Team team2;
    int scoreTeam1 = 0;
    int scoreTeam2 = 0;

    public Match(Team team1, Team team2) {
        this.team1 = team1;
        this.team2 = team2;
    }

    public void simulateMatch() {
        scoreTeam1 = (int) Math.floor(Math.random() * 5);
        scoreTeam2 = (int) Math.floor(Math.random() * 5);

        team1.addGoalsScored(scoreTeam1);
        team2.addGoalsScored(scoreTeam2);
        if (scoreTeam1 > scoreTeam2) {
            team1.addPoints(2);
        } else if (scoreTeam1 < scoreTeam2) {
            team2.addPoints(2);
        } else {
            team1.addPoints(1);
            team2.addPoints(1);
        }
        System.out.println(team1.getTeamName() + " (" + scoreTeam1 + " - " + scoreTeam2
                + ") " + team2.getTeamName());
        System.out.println("Match winner/result: " + getMatchSummary());
    }

    public String getMatchSummary() {
        String winner;
        if (scoreTeam1 > scoreTeam2) {
            winner = team1.getTeamName();
        } else if (scoreTeam1 < scoreTeam2) {
            winner = team2.getTeamName();
        } else {
            winner = "Draw";
        }
        return winner;
    }

    // Knocktout match simulation
    public void simulateKnockOut() {
        scoreTeam1 = (int) Math.floor(Math.random() * 5);
        scoreTeam2 = (int) Math.floor(Math.random() * 5);

        if (scoreTeam1 == scoreTeam2) {
            int extraTime1 = (int) Math.floor(Math.random() * 3);
            int extraTime2 = (int) Math.floor(Math.random() * 3);
            scoreTeam1 += extraTime1;
            scoreTeam2 += extraTime2;
        }

        if (scoreTeam1 > scoreTeam2) {
            team1.addPoints(2);
        } else if (scoreTeam1 < scoreTeam2) {
            team2.addPoints(2);
        }

        team1.addGoalsScored(scoreTeam1);
        team2.addGoalsScored(scoreTeam2);

        System.out.println(team1.getTeamName() + " (" + scoreTeam1 + " - " + scoreTeam2 + ") " + team2.getTeamName());
    }

    // Get the summary of a knockout match
    public String getKnockOutSummary() {
        String winner;
        if (scoreTeam1 > scoreTeam2) {
            winner = team1.getTeamName();
        } else {
            winner = team2.getTeamName();
        }
        return winner;
    }
}
