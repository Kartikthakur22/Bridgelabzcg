package Week1.Assignment4;

import java.util.Scanner;

public class SimpleInterest {
    public static float calculateSI(float p,int r,float t){
        return (p*r*t)/100;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter principal:");
        float principal=sc.nextFloat();
        System.out.print("Enter rate of interest:");
        int rate=sc.nextInt();
        System.out.print("Enter time:");
        float time=sc.nextFloat();
        float simpleInterest=calculateSI(principal,rate,time);
        System.out.println("The Simple Interest is "+simpleInterest+" for Principal "+principal+", Rate of Interest "+rate+" and Time "+time);
        sc.close();
    }
}
