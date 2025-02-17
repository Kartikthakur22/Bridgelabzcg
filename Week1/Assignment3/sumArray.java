package Week1.Assignment3;
import java.util.Scanner;

class sumArray{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double[] arr=new double[10];
        System.out.println("Enter elements");
        double total=0.0;
        int ind=0;
        while(ind<10){
            arr[ind]=sc.nextDouble();
            if(arr[ind]<=0){
                break;
            }
            ind++;
        }
        for(int i=0;i<arr.length;i++){
            total+=arr[i];
        }
        System.out.println("Total value:"+total);
        sc.close();
    }
}