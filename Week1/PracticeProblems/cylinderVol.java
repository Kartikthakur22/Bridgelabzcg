import java.util.Scanner;

public class cylinderVol {
    public static void main(String[] args) {
        double pi=3.14;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter radius of cylinder:");
        double r=sc.nextFloat();
        System.out.print("Enter height of cylinder:");
        double h=sc.nextFloat();
        double vol=pi*r*r*h;
        System.out.print("Vol of cylinder:"+vol);
    }
}
