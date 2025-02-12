package Week1.Assignment1;
import java.util.Scanner;
class quotRem{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a:");
        int a=sc.nextInt();
        System.out.println("Enter b:");
        int b=sc.nextInt();
        int quotient=a/b;
        int rem=a%b;
        System.out.println("The Quotient is "+quotient+" and Reminder is "+rem+" of two number "+a+" and "+b);
        sc.close();
    }
}