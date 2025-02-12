package Week1.Assignment2;

import java.util.Scanner;

public class marks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Maths marks:");
        int mathMarks=sc.nextInt();
        System.out.print("Enter Physics marks:");
        int physicsMarks=sc.nextInt();
        System.out.print("Enter Chem marks:");
        int chemMarks=sc.nextInt();
        int percentage=(mathMarks+physicsMarks+chemMarks)*100/300;
        if(percentage>=80){
            System.out.println("Percentage-"+percentage+" Grade-A level-4");
        }
        else if(percentage>=70 && percentage<80){
            System.out.println("Percentage-"+percentage+" Grade-B level-3");
        }
        else if(percentage>=60 && percentage<70){
            System.out.println("Percentage-"+percentage+" Grade-C level-2");
        }
        else if(percentage>=50 && percentage<60){
            System.out.println("Percentage-"+percentage+" Grade-D level-1");
        }
        else if(percentage>=40 && percentage<50){
            System.out.println("Percentage-"+percentage+" Grade-E level-1");
        }
        else{
            System.out.println("Percentage-"+percentage+" Grade-R level-0");
        }
        sc.close();
    }
}
