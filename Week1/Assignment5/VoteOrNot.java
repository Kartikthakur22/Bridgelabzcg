package Week1.Assignment5;

import java.util.Scanner;

public class VoteOrNot {
    public static int[] generateStudentAges(int n) {
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            ages[i] = (int) (Math.random() * 90) + 10;
        }
        return ages;
    }

    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] votingStatus = new String[ages.length][2];
        
        for (int i = 0; i < ages.length; i++) {
            if (ages[i] < 0) {
                votingStatus[i][0] = "Invalid Age";
                votingStatus[i][1] = "Cannot Vote";
            } else {
                votingStatus[i][0] = String.valueOf(ages[i]);
                if (ages[i] >= 18) {
                    votingStatus[i][1] = "Can Vote";
                } else {
                    votingStatus[i][1] = "Cannot Vote";
                }
            }
        }
        
        return votingStatus;
    }

    public static void displayVotingStatus(String[][] votingStatus) {
        System.out.println("Age\tVoting Eligibility");
        System.out.println("----------------------------");
        for (int i = 0; i < votingStatus.length; i++) {
            System.out.println(votingStatus[i][0] + "\t" + votingStatus[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numStudents = 10;
        int[] studentAges = generateStudentAges(numStudents);
        String[][] votingStatus = checkVotingEligibility(studentAges);
        displayVotingStatus(votingStatus);
        scanner.close();
    }
}
