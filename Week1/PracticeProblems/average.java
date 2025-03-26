import java.util.Scanner;
public class average {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number:");
        int a=sc.nextInt();
        System.out.print("Enter second number:");
        int b=sc.nextInt();
        System.out.print("Enter third number:");
        int c=sc.nextInt();
        System.out.println("Average of 3 numbers:"+(a+b+c)/3);
    }
}
