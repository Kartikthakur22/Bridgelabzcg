package Week1.Assignment1;

import java.util.Scanner;

public class handshakes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of students:");
        int numberOfStudents = input.nextInt();
        int n=numberOfStudents;
        int numberOfHandshakes=(n*(n-1))/2;
        System.out.println("Number of possible handshakes : "+numberOfHandshakes);
        input.close();
    }
}
