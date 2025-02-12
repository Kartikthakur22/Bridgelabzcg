package Week1.Assignment1;
import java.util.Scanner;

public class collegeFee2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int fee=sc.nextInt();
        int discountPercent=sc.nextInt();
        int discountedAmount=(discountPercent*fee)/100;
        int discountedFee=fee-discountedAmount;
        System.out.println("The discount amount is INR "+discountedAmount+" and final discounted fee is INR "+discountedFee);
        sc.close();
    }
}
