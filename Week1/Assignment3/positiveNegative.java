package Week1.Assignment3;

import java.util.Scanner;

public class positiveNegative {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] age=new int[10];
        System.out.println("Enter ages of 10 students");
        for(int i=0;i<age.length;i++){
            age[i]=sc.nextInt();
        }
        for(int i=0;i<age.length;i++){
            if(age[i]<0){
                System.out.println("Invalid age");
            }
            else if(age[i]>=18){
                System.out.println("Student with age "+age[i]+" can vote");
            }
            else{
                System.out.println("Student with age "+age[i]+" can not vote");
            }
        }
        sc.close();
    }
}
