package Week1.Assignment3;

import java.util.Scanner;

public class Bmi {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of persons:");
        int n=sc.nextInt();
        double[] weight=new double[n];
        double[] height=new double[n];
        double[] bmi=new double[n];
        String[] weightStatus=new String[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter weight and height of person "+i+1);
            weight[i]=sc.nextDouble();
            height[i]=sc.nextDouble();
        }
        for(int i=0;i<n;i++){
            bmi[i]=weight[i]/(height[i]*height[i]);
            if(bmi[i]<=18.4){
                weightStatus[i]="Underweight";
            }
            else if(bmi[i]>=18.5 && bmi[i]<=24.9){
                weightStatus[i]="Normal";
            }
            else if(bmi[i]>=25 && bmi[i]<=39.9){
                weightStatus[i]="Overweight";
            }
            else{
                weightStatus[i]="Obese";
            }
        }
        for(int i=0;i<n;i++){
            System.out.println("Person "+i+1+" height:"+height[i]+" weight:"+weight[i]+" Bmi:"+bmi[i]+" status:"+weightStatus[i]);
        }
        sc.close();
    }
}
