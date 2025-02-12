package Week1.Assignment1;

import java.util.Scanner;

public class triangleArea {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter base:");
        double base=sc.nextInt();
        System.out.print("Enter height:");
        double height=sc.nextInt();
        double areaInCm=(base*height)/2;
        double areaInFt=areaInCm*0.0328;
        double areaInInches=areaInCm*0.3937;
        System.out.println("Area of triangle in cm is "+areaInCm+" while in feet is "+areaInFt+" and inches is "+areaInInches);
        sc.close();
    }
}
