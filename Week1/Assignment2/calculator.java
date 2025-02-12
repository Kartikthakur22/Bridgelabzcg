package Week1.Assignment2;
import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number1:");
        int number1=sc.nextInt();
        System.out.print("Enter number2:");
        int number2=sc.nextInt();
        System.out.print("Enter operation:");
        char operation=sc.next().charAt(0);
        switch(operation){
            case '+':
                System.out.println(number1+number2);
                break;
            case '-':
                System.out.println(number1-number2);
                break;
            case '*':
                System.out.println(number1*number2);
                break;
            case '/':
                System.out.println(number1/number2);
                break;
            default:
                System.out.println("Invalid operator");
        }
        sc.close();
    }
}
