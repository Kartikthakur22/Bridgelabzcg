package Week1.Assignment1;
import java.util.Scanner;

public class doubleOperations {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a:");
        double a=sc.nextInt();
        System.out.println("Enter b:");
        double b=sc.nextInt();
        System.out.println("Enter c:");
        double c=sc.nextInt();
        double op1=a + b *c;
        double op2= a * b + c;
        double op3=c + a / b;
        double op4=a % b + c;
        System.out.println("The result of int operations are "+op1+","+op2+","+op3+" and "+op4);
        sc.close();
    }
}
