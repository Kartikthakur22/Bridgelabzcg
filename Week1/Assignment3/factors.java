package Week1.Assignment3;

import java.util.Scanner;

public class factors {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number:");
        int number=sc.nextInt();
        int[] factors=new int[10];
        int maxFactor=10,ind=0;;
        for(int i=1;i<=number;i++){
            if(number%i==0){
                if(ind==maxFactor){
                    maxFactor*=2;
                    int[] temp=new int[maxFactor];
                    for(int a=0;a<10;a++){
                        temp[a]=factors[a];
                    }
                    factors=temp;
                }
                factors[ind]=i;
                ind++;
            }
        }
        System.out.println("Factors of "+number+" are ");
        for(int i=0;i<factors.length;i++){
            if(factors[i]==0){
                continue;
            }
            else{
                System.out.print(factors[i]+" ");
            }
        }
        sc.close();
    }
}
