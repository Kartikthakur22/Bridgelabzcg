import java.util.Scanner;

public class circleArea {
    public static void main(String[] args) {
        double pi=3.14;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter radius of circle:");
        double r=sc.nextFloat();
        double a=pi*r*r;
        System.out.print("Area of circle:"+a);
    }
}
