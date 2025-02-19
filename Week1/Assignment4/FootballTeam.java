package Week1.Assignment4;

import java.util.Scanner;
import java.util.Random;
public class FootballTeam {
    public static int sumOfHeights(int[] heights){
        int sum=0;
        for(int height:heights){
            sum+=height;
        }
        return sum;
    }
    public static int meanOfHeights(int[] heights){
        int sum=0;
        for(int height:heights){
            sum+=height;
        }
        return sum/heights.length;
    }
    public static int shortestOfHeights(int[] heights){
        int shortest=Integer.MAX_VALUE;
        for(int height:heights){
            shortest=Math.min(shortest,height);
        }
        return shortest;
    }
    public static int tallestOfHeights(int[] heights){
        int tallest=Integer.MIN_VALUE;
        for(int height:heights){
            tallest=Math.max(tallest,height);
        }
        return tallest;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println();
        System.out.print("Generated heights:");
        int[] heights=new int[11];
        for(int i=0;i<11;i++){
            heights[i]=150 + (int)(Math.random() * (250 - 150 + 1));
            System.out.print(heights[i]+" ");
        }
        int sum=sumOfHeights(heights);
        int mean=meanOfHeights(heights);
        int shortest=shortestOfHeights(heights);
        int tallest=tallestOfHeights(heights);
        System.out.println("\nSum of heights:"+sum);
        System.out.println("Mean of heights:"+mean);
        System.out.println("Shortest height:"+shortest);
        System.out.println("Tallest height:"+tallest);
    }
}
