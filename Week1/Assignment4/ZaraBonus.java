package Week1.Assignment4;

import java.util.Random;

public class ZaraBonus {

    public static void main(String[] args) {
        double[][] employeeData = generateEmployeeData();
        double[][] salaryAndBonus = calculateBonus(employeeData);
        displaySalariesAndBonuses(employeeData, salaryAndBonus);
    }

    public static double[][] generateEmployeeData() {
        Random rand = new Random();
        double[][] employeeData = new double[10][2];

        for (int i = 0; i < 10; i++) {
            double salary = 10000 + rand.nextInt(90000);
            int yearsOfService = 1 + rand.nextInt(15);
            employeeData[i][0] = salary;
            employeeData[i][1] = yearsOfService;
        }

        return employeeData;
    }

    public static double[][] calculateBonus(double[][] employeeData) {
        double[][] salaryAndBonus = new double[10][3];

        for (int i = 0; i < 10; i++) {
            double salary = employeeData[i][0];
            int yearsOfService = (int) employeeData[i][1];
            double bonusPercentage = yearsOfService > 5 ? 0.05 : 0.02;
            double bonus = salary * bonusPercentage;
            double newSalary = salary + bonus;

            salaryAndBonus[i][0] = bonus;
            salaryAndBonus[i][1] = newSalary;
            salaryAndBonus[i][2] = salary;
        }

        return salaryAndBonus;
    }

    public static void displaySalariesAndBonuses(double[][] employeeData, double[][] salaryAndBonus) {
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;

        System.out.println("Employee\tOld Salary\t\tBonus\t\tNew Salary");

        for (int i = 0; i < 10; i++) {
            double oldSalary = employeeData[i][0];
            double bonus = salaryAndBonus[i][0];
            double newSalary = salaryAndBonus[i][1];

            totalOldSalary += oldSalary;
            totalBonus += bonus;
            totalNewSalary += newSalary;

            System.out.println((i + 1) + "\t\t" + oldSalary + "\t\t" + bonus + "\t\t" + newSalary);
        }
        System.out.println("Total\t\t" + totalOldSalary + "\t\t" + totalBonus + "\t\t" + totalNewSalary);
    }
}

