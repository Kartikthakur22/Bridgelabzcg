package Week1.Assignment4;

import java.util.Scanner;

public class HandshakesDone {
    public static int handshakes(int numberOfStudents){
        return (numberOfStudents*(numberOfStudents-1))/2;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of students:");
        int numberOfStudents = input.nextInt();
        int numberOfHandshakes=handshakes(numberOfStudents);
        System.out.println("Number of possible handshakes : "+numberOfHandshakes);
        input.close();
    }
}
