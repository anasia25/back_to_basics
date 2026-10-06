package java_basics.fundamentals;

import java.util.Scanner;

public class GreatestCommonDivisor_11 {
    // Find the greatest common divisor among two numbers

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int no_1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int no_2 = scanner.nextInt();

        scanner.close();

        System.out.println("\nThe greatest divisor is " + greatestCommonDivisor(no_1, no_2));
    }

    public static int greatestCommonDivisor(int no_1, int no_2) {
        int gcd = 1;

        int min = Math.min(no_1, no_2);

        for (int i = 2; i < min + 1; i++) {
            while (no_1 % i == 0 && no_2 % i == 0) {
                gcd *= i;
                no_1 /= i;
                no_2 /= i;
            }
        }

        return gcd;
    }
}
