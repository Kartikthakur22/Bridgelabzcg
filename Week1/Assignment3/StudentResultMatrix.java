package Week1.Assignment3;

import java.util.Scanner;

public class StudentResultMatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of students:");
        int n=sc.nextInt();
        int[][] marks=new int[n][3];
        float[] percentage=new float[n];
        char[] grades=new char[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter marks in physics of student "+i+1);
            marks[i][0]=sc.nextInt();
            System.out.print("Enter marks in chem of student "+i+1);
            marks[i][1]=sc.nextInt();
            System.out.print("Enter marks in maths of student "+i+1);
            marks[i][2]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            int totalMarksScored=marks[i][0]+marks[i][1]+marks[i][2];
            percentage[i]=(totalMarksScored*100)/300;
            if(percentage[i]>=80){
                grades[i]='A';
            }
            else if(percentage[i]>=70 && percentage[i]<79){
                grades[i]='B';
            }
            else if(percentage[i]>=60 && percentage[i]<69){
                grades[i]='C';
            }
            else if(percentage[i]>=50 && percentage[i]<59){
                grades[i]='D';
            }
            else if(percentage[i]>=40 && percentage[i]<49){
                grades[i]='E';
            }
            else{
                grades[i]='R';
            }
        }
        for(int i=0;i<n;i++){
            System.out.println("Result of student "+i+1+"-> Marks in physics:"+marks[i][0]+" Marks in maths:"+marks[i][2]+" Marks in chem:"+marks[i][1]+" Grade:"+grades[i]+" Percentage:"+percentage[i]);
        }
    }
}
