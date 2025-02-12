package Week1.Assignment2;
import java.util.Scanner;
public class divBy5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number:");
        int number=sc.nextInt();
        boolean divisibleOrNot=false;
        if(number%5==0){
            divisibleOrNot=true;
        }
        System.out.println("Is the number "+number+" divisible by 5? "+divisibleOrNot);
        sc.close();
    }
}
