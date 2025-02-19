package Week1.Assignment4;

import java.util.Scanner;

public class Bmi {
    public static double bmiCalculator(double weight,double height){
        return weight/Math.pow(height,2);
    }
    public static void statusCalculator(double[][] data,String[] bmiStatus){
        for(int i=0;i<10;i++){
            if(data[i][2]<=18.4){
                bmiStatus[i]="Underweight";
            }
            else if(data[i][2]>=18.5 && data[i][2]<=24.9){
                bmiStatus[i]="Normal";
            }
            else if(data[i][2]>=25 && data[i][2]<=39.9){
                bmiStatus[i]="Overweight";
            }
            else{
                bmiStatus[i]="Obese";
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double[][] data=new double[10][3];
        for(int i=0;i<10;i++){
            System.out.print("Enter weight in kgs of person "+(i+1)+"-");
            data[i][0]=sc.nextDouble();
            System.out.print("Enter height in cm of person "+(i+1)+"-");
            data[i][1]=sc.nextDouble();
        }
        for(int i=0;i<10;i++){
            data[i][1]/=100;
            data[i][2]=bmiCalculator(data[i][0],data[i][1]);
        }
        String[] bmiStatus=new String[10];
        statusCalculator(data,bmiStatus);
        for(int i=0;i<10;i++){
            System.out.println("Person "+(i+1)+" Weight:"+data[i][0]+" Height:"+data[i][1]+" Bmi:"+data[i][2]+" Bmi status:"+bmiStatus[i]);
        }
    }
}
