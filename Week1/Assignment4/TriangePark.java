package Week1.Assignment4;

import java.util.Scanner;

public class TriangePark {
    public static int rounds(int distanceToRun,int perimeter){
        return distanceToRun/perimeter;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter length of first side of triangular park::");
        int side1=sc.nextInt();
        System.out.print("Enter length of second side of triangular park::");
        int side2=sc.nextInt();
        System.out.print("Enter length of third side of triangular park::");
        int side3=sc.nextInt();
        int perimeter=side1+side2+side3;
        int distanceToRun=5;
        int numberOfRounds=rounds(distanceToRun, perimeter);
        System.out.println("Athlete must complete "+numberOfRounds);
        sc.close();
    }
}
