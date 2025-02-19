package Week1.Assignment4;

import java.util.Scanner;

import Week1.Assignment3.factors;

public class Factors {
    public static int[] findFactors(int n){
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        int[] factors=new int[count];
        int j=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                factors[j++]=i;
            }
        }
        return factors;
    }
    public static int sumOfFactors(int[] factors){
        int sum=0;
        for(int i=0;i<factors.length;i++){
            sum+=factors[i];
        }
        return sum;
    }
    public static int productOfFactors(int[] factors){
        int product=1;
        for(int i=0;i<factors.length;i++){
            product*=factors[i];
        }
        return product;
    }
    public static int sumOfSquares(int[] factors){
        int squaresSum=0;
        for(int i=0;i<factors.length;i++){
            squaresSum+=Math.pow(factors[i],2);
        }
        return squaresSum;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number");
        int n=sc.nextInt();
        int[] factors=findFactors(n);
        int sum=sumOfFactors(factors);
        int product=productOfFactors(factors);
        int squaresSum=sumOfSquares(factors);
        System.out.print("Factors of "+n+"are ");
        for(int i=0;i<factors.length;i++){
            System.out.print(factors[i]+" ");
        }
        System.out.println("Sum of factors:"+sum);
        System.out.println("Product of factors:"+product);
        System.out.println("Sum of squares of factors:"+squaresSum);
        sc.close();
    }
}
