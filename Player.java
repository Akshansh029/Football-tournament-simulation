
public class Player {

    String name;
    String position;
    int goalsScored = 0;

    public void scoreGoal() {
        goalsScored++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getGoalsScored() {
        return goalsScored;
    }
}
