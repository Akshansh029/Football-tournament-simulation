
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Football Tournament Simulation!\n");
        System.out.println("We are starting with the group stages of UEFA Champions League 2024/25\n");

        Tournament UCL = new Tournament();
        UCL.createTeams();
        UCL.createGroups();
        UCL.playGroupStages();
        UCL.playKnockouts();

        System.out.println(String.format("Congratulations to %s for winning the UEFA Champions League 2024/25", UCL.getFinalWinner()));
    }
}
