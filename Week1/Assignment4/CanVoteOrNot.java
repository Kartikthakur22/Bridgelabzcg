package Week1.Assignment4;

import java.util.Scanner;

public class CanVoteOrNot {
    public static boolean canStudentVote(int age){
        if(age>=18){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] ages=new int[10];
        for(int i=0;i<ages.length;i++){
            System.out.print("Enter age of student "+(i+1)+":");
            ages[i]=sc.nextInt();
            if(canStudentVote(ages[i])){
                System.out.println("Can Vote");
            }
            else{
                System.out.println("Can not vote");
            }
        }
    }
}
