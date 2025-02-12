package Week1.Assignment1;
import java.util.Scanner;

public class intOperations {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a:");
        int a=sc.nextInt();
        System.out.println("Enter b:");
        int b=sc.nextInt();
        System.out.println("Enter c:");
        int c=sc.nextInt();
        int op1=a + b *c;
        int op2= a * b + c;
        int op3=c + a / b;
        int op4=a % b + c;
        System.out.println("The result of int operations are "+op1+","+op2+","+op3+" and "+op4);
        sc.close();
    }
}
