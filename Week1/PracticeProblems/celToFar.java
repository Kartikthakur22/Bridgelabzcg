import java.util.Scanner;
public class celToFar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter temp in celsius:");
        float c=sc.nextFloat();
        float f=(c*9/5)+32;
        System.out.print("Temp in fahrenheit:"+f);
    }
}
