package Week1.Assignment1;

import java.util.Scanner;

public class feetToYdMiles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Distance in feets:");
        double feet = input.nextInt();
        double yard=feet/3;
        double miles=feet/5280;
        System.out.println("Distance in ft is "+feet+" while in yards is "+yard+" and miles is "+miles);
        input.close();
    }
}
