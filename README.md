# Tournament Simulation

This is a simple Java-based tournament simulation project, which involves creating teams, forming groups, simulating group-stage matches, and performing knockout rounds to determine a final winner.

![image](https://github.com/user-attachments/assets/d2306015-f2ff-4628-90bd-fdd067134282)


## Features

- **User Input**: Taking user input for the names of the teams for creation of 16 teams.
- **Group Creation**: Divide the teams into 4 groups (A, B, C, D), each containing 4 teams.
- **Match Simulation**: Simulate matches for both group stages and knockout rounds with random scores.
- **Points System**: Teams earn points based on match results:
  - Win: 2 points
  - Draw: 1 point
  - Loss: 0 points
- **Knockout Rounds**: The top two teams from each group progress to the knockout stage.

## Classes

### `Tournament`

This is the main class that manages the entire tournament. It includes:

- `createTeams()`: Creates 16 teams.
- `createGroups()`: Divides teams into 4 groups and assigns them.
- `playGroupStages()`: Simulates group-stage matches and updates team standings.
- `playKnockouts()`: Simulates the knockout rounds (from top teams of each group).

### `Group`

Represents a group in the tournament. Each group contains 4 teams. It includes:

- `createMatches()`: Generates matches between each pair of teams in the group.
- `updateStandings()`: Updates the standings after matches.
- `getQualifiedTeams()`: Returns the top 2 teams from the group based on points and goals scored.

### `Match`

Simulates a match between two teams. It includes:

- `simulateMatch()`: Simulates a match and updates team scores and points.
- `getMatchSummary()`: Returns the result of the match.

### `Team`

Represents a team in the tournament. It includes:

- Attributes such as `teamName`, `points`, `goalsScored`.
- Methods to add goals and update points.

![image](https://github.com/user-attachments/assets/e22e1b82-d604-4848-a672-68499da1cde6)


## How to Run

1. Clone the repository:

   ```bash
   git clone https://github.com/Akshansh029/Football-tournament-simulation.git
   ```

2. Compile and run the Main class (or Tournament class) to simulate the tournament.

```bash
javac *.java
java Main
```

Or if using an IDE, just run the main method in the Main class.

3. Observe the results as the tournament progresses from group stages to knockout rounds.

Example Output

```text
Team 1 2 - 1 Team 2
Team 3 0 - 0 Team 4
...
Match winner/result: Team 1
```

## Future Improvements

- Implement a more sophisticated points system (e.g., goal difference, goals scored).
- Add support for additional stages like semi-finals, third-place playoffs, etc.
- Store the tournament results in a file (e.g., JSON, CSV).
