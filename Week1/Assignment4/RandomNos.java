package Week1.Assignment4;
public class RandomNos {
    public static int[] generate(int size) {
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = 1000 + (int)(Math.random() * (9000 - 1000 + 1)); 
        }
        return numbers;
    }

    public static double[] findAverageMinMax(int[] numbers) {
        double sum = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : numbers) {
            sum += num;
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        double average = sum / numbers.length;
        return new double[]{average, min, max};
    }

    public static void main(String[] args) {
        int size = 5;  
        int[] randomNumbers = generate(size);
        System.out.println("Generated random 4-digit numbers:");
        for (int num : randomNumbers) {
            System.out.println(num);
        }
        double[] stats = findAverageMinMax(randomNumbers);

        System.out.println("\nStatistics:");
        System.out.println("Average: " + stats[0]);
        System.out.println("Minimum: " + stats[1]);
        System.out.println("Maximum: " + stats[2]);
    }
}
