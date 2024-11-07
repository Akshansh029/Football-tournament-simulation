
public class Team {

    private String teamName;
    private int points = 0;
    private int goalsScored = 0;
    private Player[] players = new Player[11];
    private int index = 0;

    public Team(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public int getPoints() {
        return points;
    }

    public void addPoints(int points) {
        this.points += points;
    }

    public int getGoalsScored() {
        return goalsScored;
    }

    public void addGoalsScored(int goals) {
        this.goalsScored += goals;
    }

    public Player[] getPlayers() {
        return players;
    }

    public boolean addPlayer(Player pl) {
        if (index < 11) {
            players[index++] = pl;
            return true;
        } else {
            System.out.println("Cannot add more than 11 players to the team.");
            return false;
        }
    }

    @Override
    public String toString() {
        return teamName + ", Points: " + points + ", Goals Scored: " + goalsScored;
    }
}
