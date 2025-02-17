package Week1.Assignment3;

import java.util.Scanner;

public class oddEvenArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int number=sc.nextInt();
        if(number<=0){
            System.out.println("Error");
        }
        else{
            int[] odd=new int[(number/2)+1];
            int[] even=new int[(number/2)+1];
            int evenInd=0,oddInd=0;
            for(int i=0;i<=number;i++){
                if(i%2==0){
                    even[evenInd]=i;
                    evenInd++;
                }
                else{
                    odd[oddInd]=i;
                    oddInd++;
                }
            }
            System.out.print("Odd Array: ");
            for(int i=0;i<odd.length;i++){
                System.out.print(odd[i]+" ");
            }
            System.out.print("Even Array: ");
            for(int i=0;i<even.length;i++){
                System.out.print(even[i]+" ");
            }
        }
        sc.close();
    }
}
