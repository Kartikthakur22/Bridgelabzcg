package Week1.Assignment3;

import java.util.Scanner;

public class compareHeightAge {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] height=new int[3];
        int[] age=new int[3];
        System.out.println("Enter heights of 3 friends:");
        for(int i=0;i<3;i++){
            height[i]=sc.nextInt();
        }
        System.out.println("Enter ages of 3 friends:");
        for(int i=0;i<3;i++){
            age[i]=sc.nextInt();
        }
        if(age[0]<age[1] && age[0]<age[2]){
            System.out.print("Amar is youngest among three");
        }
        else if(age[1]<age[0] && age[1]<age[2]){
            System.out.print("Akbar is youngest among three");
        }
        else{
            System.out.print("Anthony is youngest among three");
        }
        if(height[0]>height[1] && height[0]>height[2]){
            System.out.print("Amar is tallest among three");
        }
        else if(height[1]>height[0] && height[1]>height[2]){
            System.out.print("Akbar is tallest among three");
        }
        else{
            System.out.print("Anthony is tallest among three");
        }
        sc.close();
    }
}
