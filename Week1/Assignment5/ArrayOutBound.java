package Week1.Assignment5;

import java.util.Scanner;

public class ArrayOutBound {
    public static void generateException(String[] names, int index) {
        System.out.println("Accessing index: " + index);
        System.out.println("Name at index: " + names[index]);
    }

    public static void handleException(String[] names, int index) {
        try {
            generateException(names, index);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index " + index + " is out of bounds for the array.");
        } catch (RuntimeException e) {
            System.out.println("A runtime exception occurred: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] names = {"A", "B", "C", "D", "E"};
        
        System.out.print("Enter an index to access (e.g., 0 to 4): ");
        int index = scanner.nextInt();
        
        System.out.println("Generating exception...");
        handleException(names, index);
        
        scanner.close();
    }
}
