package Week1.Assignment2;
import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double sum=0.0;
        while(true){
            double next=sc.nextInt();
            if(next==0){
                break;
            }
            sum+=next;
        }
        System.out.println("Sum of numbers until user entered 0"+sum);
        sc.close();
    }
}
