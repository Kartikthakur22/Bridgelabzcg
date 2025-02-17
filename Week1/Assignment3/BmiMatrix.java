package Week1.Assignment3;

import java.util.Scanner;

public class BmiMatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of persons:");
        int number=sc.nextInt();
        double[][] personData = new double[number][3];
        String[] weightStatus=new String[number];
        for(int i=0;i<number;i++){
            for(int j=0;j<2;j++){
                System.out.println("Enter weight and height respectively of person "+i+1);
                personData[i][j]=sc.nextDouble();
            }
        }
        for(int i=0;i<number;i++){
            personData[i][2]=personData[i][0]/(personData[i][1]*personData[i][1]);
            if(personData[i][2]<=18.4){
                weightStatus[i]="Underweight";
            }
            else if(personData[i][2]>=18.5 && personData[i][2]<=24.9){
                weightStatus[i]="Normal";
            }
            else if(personData[i][2]>=25 && personData[i][2]<=39.9){
                weightStatus[i]="Overweight";
            }
            else{
                weightStatus[i]="Obese";
            }
        }
        for(int i=0;i<number;i++){
            System.out.println("Person "+i+1+" height:"+personData[i][1]+" weight:"+personData[i][0]+" Bmi:"+personData[i][2]+" status:"+weightStatus[i]);
        }
        sc.close();
    }
}
