package Week1.Assignment4;

import java.util.Scanner;

public class YoungestTallest {
    public static void findTallestYoungest(int[] age,int[] height){
        if(age[0]<age[1] && age[0]<age[2]){
            System.out.println("Amar is youngest among three");
        }
        else if(age[1]<age[0] && age[1]<age[2]){
            System.out.println("Akbar is youngest among three");
        }
        else{
            System.out.println("Anthony is youngest among three");
        }
        if(height[0]>height[1] && height[0]>height[2]){
            System.out.println("Amar is tallest among three");
        }
        else if(height[1]>height[0] && height[1]>height[2]){
            System.out.println("Akbar is tallest among three");
        }
        else{
            System.out.println("Anthony is tallest among three");
        }
    }
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
        findTallestYoungest(age, height);
        sc.close();
    }
}
