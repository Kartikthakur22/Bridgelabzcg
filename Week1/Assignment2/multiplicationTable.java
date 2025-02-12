package Week1.Assignment2;
import java.util.Scanner;
public class multiplicationTable {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number:");
        int num=sc.nextInt();
        if(num<6 || num>9){
            System.out.println("Not entered num from 6 to 9");
        }
        else{
            for(int i=1;i<=10;i++){
                System.out.println(num+"*"+i+"="+(num*i));
            }
        }
        sc.close();
    }
}
