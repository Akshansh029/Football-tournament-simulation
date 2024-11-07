
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Football Tournament Simulation!\n");
        System.out.println("We are starting with the group stages of UEFA Champions League 2024/25\n");

        List<Team> teams = new ArrayList<>();
        System.out.println("Enter your 16 teams: ");
        for (int i = 0; i < 16; i++) {
            String teamName = sc.nextLine();
            teams.add(new Team(teamName));
        }
        System.out.println();

        sc.close();
        Tournament UCL = new Tournament();
        UCL.createTeams(teams);
        UCL.createGroups();
        UCL.playGroupStages();
        UCL.playKnockouts();

        System.out.println(String.format("Congratulations to %s for winning the UEFA Champions League 2024/25", UCL.getFinalWinner()));
    }
}
