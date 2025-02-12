package Week1.Assignment1;
public class earthVol {
    public static void main(String[] args) {
        int radius=6378;
        final double pi=3.14;
        double volInKm=(4/3)*pi*(Math.pow(radius,3));
        double volInMiles=volInKm*0.6214;
        System.out.println("The volume of earth in cubic kilometers is "+volInKm+" and cubic miles is "+volInMiles);
    }
}
