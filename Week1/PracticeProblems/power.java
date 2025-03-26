import java.util.Scanner;
import java.util.*;

public class power {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter base:");
        double b=sc.nextDouble();
        System.out.print("Enter exponent:");
        double e=sc.nextDouble();
        System.out.println("Power calculation:"+Math.pow(b,e));
    }
}
