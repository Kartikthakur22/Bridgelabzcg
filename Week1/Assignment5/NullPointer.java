package Week1.Assignment5;

public class NullPointer {
    public static void generateNullPointerException() {
        String text=null;
        int length=text.length(); 
        System.out.println("Length of the string: " + length);
    }
    
    public static void handleNullPointerException() {
         String text=null;
        try {
            int length=text.length();  
            System.out.println("Length of the string: " + length);
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: String is null, cannot call method on it.");
        }
    }
    
    public static void main(String[] args) {
        System.out.println("Generating NullPointerException:");
        try {
            generateNullPointerException();
        } catch (NullPointerException e) {
            System.out.println("Exception generated: " + e);
        }
        System.out.println("\nHandling NullPointerException using try-catch:");
        handleNullPointerException();
    }
}
