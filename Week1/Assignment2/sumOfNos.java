package Week1.Assignment2;
import java.util.Scanner;
public class sumOfNos {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n:");
        int n=sc.nextInt();
        if(n>=0){
            int sum=(n*(n+1))/2;
            System.out.println("The sum of "+n+" natural numbers is "+sum);
        }else{
            System.out.println("The number "+n+" is not a natural number.");
        }
        sc.close();
    }
}
