package Week1.Assignment4;

import java.util.Scanner;

public class WindChill {
    public static double calculateWindChill(double temperature, double windSpeed){
        double windChill = 35.74 + 0.6215 *temperature + (0.4275*temperature - 35.75) * Math.pow(windSpeed,0.16);
        return windChill;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter temperature:");
        double temperature=sc.nextFloat();
        System.out.print("Enter windSpeed:");
        double windSpeed=sc.nextFloat();
        double ans=calculateWindChill(temperature,windSpeed);
        System.out.println("Wind chill temperature will be "+ans);
        sc.close();
    }
}
