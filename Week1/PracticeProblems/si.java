import java.util.Scanner;

public class si {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter principal:");
        double p=sc.nextFloat();
        System.out.print("Enter rate:");
        double r=sc.nextFloat();
        System.out.print("Enter time:");
        double t=sc.nextFloat();
        double si=(p*r*t)/100;
        System.out.print("Simple Interest:"+si);
    }
}
