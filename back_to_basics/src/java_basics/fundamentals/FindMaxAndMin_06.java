package java_basics.fundamentals;

import java.util.Random;
import java.util.Scanner;

public class FindMaxAndMin_06 {
    // Find the maximum and minimum

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("How many numbers? ");
        int amount = scanner.nextInt();

        int[] numbers = new int[amount];
        int[] numbersRandom = new int[amount];

        for (int i = 0; i < amount; i++) {
            System.out.println("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        for (int i = 0; i < amount; i++) {
            numbersRandom[i] = random.nextInt();
        }

        scanner.close();

        System.out.println("---- User generated numbers ----");
        findMaxAndMin(numbers);

        System.out.println("---- Randomly generated numbers ----");
        findMaxAndMin(numbersRandom);
    }

    public static void findMaxAndMin(int[] numbers) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int num : numbers) {
            if (num > max) {
                max = num;
            }

            if (num < min) {
                min = num;
            }
        }

        System.out.println("Min = " + min + ", Max = " + max);
    }
}
