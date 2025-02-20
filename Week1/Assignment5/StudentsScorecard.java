package Week1.Assignment5;

import java.util.Random;

public class StudentsScorecard {

    
    public static int[][] generateScores(int numStudents) {
        Random rand = new Random();
        int[][] scores = new int[numStudents][3];

        for (int i = 0; i < numStudents; i++) {
            scores[i][0] = rand.nextInt(51) + 50; 
            scores[i][1] = rand.nextInt(51) + 50; 
            scores[i][2] = rand.nextInt(51) + 50;
        }

        return scores;
    }

    public static double[][] calculateTotalAveragePercentage(int[][] scores) {
        int numStudents = scores.length;
        double[][] results = new double[numStudents][4]; 

        for (int i = 0; i < numStudents; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            results[i][0] = total;
            results[i][1] = Math.round(average * 100.0) / 100.0; 
            results[i][2] = Math.round(percentage * 100.0) / 100.0; 
        }

        return results;
    }

    public static String[] calculateGrades(double[][] results) {
        String[] grades = new String[results.length];

        for (int i = 0; i < results.length; i++) {
            double percentage = results[i][2];
            if (percentage >= 80) {
                grades[i] = "A";
            } else if (percentage>=70 && percentage<79) {
                grades[i] = "B";
            } else if (percentage>=60 && percentage<69) {
                grades[i] = "C";
            } else if (percentage>=50 && percentage<59) {
                grades[i] = "D";
            } else if (percentage>=50 && percentage<59){
                grades[i] = "E";
            }else{
                grades[i]="R";
            }
        }

        return grades;
    }

    public static void displayScorecard(int[][] scores, double[][] results, String[] grades) {
        System.out.println("Student No.\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage\tGrade");
        System.out.println("----------------------------------------------------------------------");

        for (int i = 0; i < scores.length; i++) {
            System.out.println((i + 1) + "\t\t" + scores[i][0] + "\t" + scores[i][1] + "\t" + scores[i][2] + "\t" +
                    results[i][0] + "\t" + results[i][1] + "\t" + results[i][2] + "\t\t" + grades[i]);
        }
    }

    public static void main(String[] args) {
        int numStudents = 5; 
        int[][] scores = generateScores(numStudents);
        double[][] results = calculateTotalAveragePercentage(scores);
        String[] grades = calculateGrades(results);
        displayScorecard(scores, results, grades);
    }
}
