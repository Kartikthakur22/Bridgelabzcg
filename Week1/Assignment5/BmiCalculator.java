package Week1.Assignment5;

import java.util.Scanner;

public class BmiCalculator {
    public static String[][] calculateBMIAndStatus(double[][] data) {
        String[][] result = new String[10][4];
        for (int i = 0; i < 10; i++) {
            double weight = data[i][0];
            double heightInMeters = data[i][1] / 100;
            double bmi = weight / (heightInMeters * heightInMeters);
            String status;

            if (bmi < 18.5) {
                status = "Underweight";
            } else if (bmi >= 18.5 && bmi < 24.9) {
                status = "Normal weight";
            } else if (bmi >= 25 && bmi < 29.9) {
                status = "Overweight";
            } else {
                status = "Obese";
            }

            result[i][0] = String.format("%.2f", data[i][1]) + " cm";
            result[i][1] = String.format("%.2f", data[i][0]) + " kg";
            result[i][2] = String.format("%.2f", bmi);
            result[i][3] = status;
        }
        return result;
    }

    public static void displayBMIResults(String[][] results) {
        System.out.println("Person No.\tHeight\t\tWeight\t\tBMI\t\tStatus");
        System.out.println("----------------------------------------------------------");
        for (int i = 0; i < results.length; i++) {
            System.out.println((i + 1) + "\t\t" + results[i][0] + "\t" + results[i][1] + "\t" + results[i][2] + "\t" + results[i][3]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[][] data = new double[10][2];

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter details for person " + (i + 1) + ":");
            System.out.print("Enter weight (in kg): ");
            data[i][0] = scanner.nextDouble();
            System.out.print("Enter height (in cm): ");
            data[i][1] = scanner.nextDouble();
        }

        String[][] bmiResults = calculateBMIAndStatus(data);
        displayBMIResults(bmiResults);

        scanner.close();
    }
}
