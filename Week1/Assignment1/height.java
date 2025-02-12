package Week1.Assignment1;
import java.util.Scanner;
public class height {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double heightInCm=sc.nextInt();
        double Inches=heightInCm*0.3937;
        double Foots=heightInCm*0.0328;
        System.out.println("Your Height in cm is "+heightInCm+" while in feet is "+Foots+" and inches is "+Inches);
        sc.close();
    }
}
