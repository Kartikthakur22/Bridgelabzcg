import java.util.Scanner;

public class rectPeri {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter length of rect:");
        double l=sc.nextFloat();
        System.out.print("Enter width of rect:");
        double w=sc.nextFloat();
        double peri=2*(l+w);
        System.out.print("Perimeter of rectangle:"+peri);
    }
}
