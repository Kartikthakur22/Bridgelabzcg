import java.util.Scanner;

public class kmToMiles {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter distance in km:");
        float km=sc.nextFloat();
        System.out.print("Distance in miles:"+(km*0.621371));
    }
}
