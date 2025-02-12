package Week1.Assignment1;
public class profit {
    public static void main(String[] args) {
        int cp=129;
        int sp=191;
        int profitEarned=sp-cp;
        double profitPercent=(profitEarned*100)/cp;
        System.out.println("The Cost Price is INR "+cp+" and Selling Price is INR "+sp);
        System.out.println("The Profit is INR "+profitEarned+" and the Profit Percentage is "+profitPercent);
    }
}
