package Week1.Assignment4;

import java.util.Random;
import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        double[][] scores = generateScores(numStudents);
        double[][] results = calculateResults(scores);
        displayScorecard(results, scores);
    }

    public static double[][] generateScores(int numStudents) {
        Random rand = new Random();
        double[][] scores = new double[numStudents][3];

        for (int i = 0; i < numStudents; i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j] = 20 + rand.nextInt(81); // Random 2-digit score between 20 and 100
            }
        }

        return scores;
    }

    public static double[][] calculateResults(double[][] scores) {
        double[][] results = new double[scores.length][4]; // Total, Average, Percentage, and rounded percentage

        for (int i = 0; i < scores.length; i++) {
            double total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3;
            double percentage = (total / 300) * 100;

            results[i][0] = total;
            results[i][1] = Math.round(average * 100.0) / 100.0;
            results[i][2] = Math.round(percentage * 100.0) / 100.0;
        }

        return results;
    }

    public static void displayScorecard(double[][] results, double[][] scores) {
        System.out.println("Student\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage");

        for (int i = 0; i < results.length; i++) {
            double total = results[i][0];
            double average = results[i][1];
            double percentage = results[i][2];

            System.out.print((i + 1) + "\t");
            for (int j = 0; j < 3; j++) {
                System.out.print(scores[i][j] + "\t\t");
            }
            System.out.println(total + "\t" + average + "\t" + percentage);
        }
    }
}
