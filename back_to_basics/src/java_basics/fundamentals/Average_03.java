package java_basics.fundamentals;

import java.util.Scanner;

public class Average_03 {
    // Calculating the average

    public static void main(String[] args) {
        System.out.println("The average is " + avgCalculator() + ".");
    }

    public static int[] takeNumbers() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many numbers?");
        int amount = scanner.nextInt();

        int[] numbers = new int[amount];

        for (int i = 0; i < amount; i++) {
            System.out.println("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        scanner.close();

        return numbers;
    }

    public static double avgCalculator() {
        int[] numbers = takeNumbers();

        if (numbers.length == 0) {
            return 0.0;
        }

        double sum = 0;

        for (int i : numbers) {
            sum += i;
        }

        return sum / numbers.length;
    }
}