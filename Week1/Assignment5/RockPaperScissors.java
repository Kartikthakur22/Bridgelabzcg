package Week1.Assignment5;

import java.util.Scanner;

public class RockPaperScissors {

    public static String computerChoice() {
        int choice = (int) (Math.random() * 3);
        switch (choice) {
            case 0: return "Rock";
            case 1: return "Paper";
            case 2: return "Scissors";
            default: return "";
        }
    }

    public static String findWinner(String userChoice, String compChoice) {
        if (userChoice.equals(compChoice)) {
            return "Draw";
        }
        switch (userChoice) {
            case "Rock":
                return compChoice.equals("Scissors") ? "Player" : "Computer";
            case "Paper":
                return compChoice.equals("Rock") ? "Player" : "Computer";
            case "Scissors":
                return compChoice.equals("Paper") ? "Player" : "Computer";
            default: return "";
        }
    }

    public static String[][] calculateStats(int totalGames, int playerWins, int computerWins, String[][] results) {
        double playerWinPercentage = (double) playerWins / totalGames * 100;
        double computerWinPercentage = (double) computerWins / totalGames * 100;

        results[totalGames + 1][0] = "Player Win Percentage: ";
        results[totalGames + 1][1] = String.format("%.2f", playerWinPercentage);
        results[totalGames + 1][2] = "Computer Win Percentage: ";
        results[totalGames + 1][3] = String.format("%.2f", computerWinPercentage);

        return results;
    }

    public static void displayStats(String[][] results) {
        System.out.println("Game No.\tPlayer Choice\tComputer Choice\tWinner");
        System.out.println("--------------------------------------------------------");
        for (int i = 0; i < results.length; i++) {
            System.out.print(results[i][0] + "\t");
            for (int j = 1; j < results[i].length; j++) {
                System.out.print(results[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of games to play: ");
        int totalGames = scanner.nextInt();
        scanner.nextLine(); // To consume the newline character after the number input

        int playerWins = 0, computerWins = 0;

        String[][] results = new String[totalGames + 2][4];  // +2 for the header and final statistics row

        for (int i = 0; i < totalGames; i++) {
            System.out.print("Enter your choice (Rock, Paper, Scissors): ");
            String userChoice = scanner.nextLine();
            
            while (!userChoice.equals("Rock") && !userChoice.equals("Paper") && !userChoice.equals("Scissors")) {
                System.out.println("Invalid choice, try again.");
                userChoice = scanner.nextLine();
            }

            String compChoice = computerChoice();
            String winner = findWinner(userChoice, compChoice);

            if (winner.equals("Player")) {
                playerWins++;
            } else if (winner.equals("Computer")) {
                computerWins++;
            }

            results[i][0] = String.valueOf(i + 1);
            results[i][1] = userChoice;
            results[i][2] = compChoice;
            results[i][3] = winner;
        }

        results = calculateStats(totalGames, playerWins, computerWins, results);
        displayStats(results);

        scanner.close();
    }
}
