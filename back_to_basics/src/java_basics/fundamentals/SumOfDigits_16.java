package java_basics.fundamentals;

import java.util.Scanner;

public class SumOfDigits_16 {
    // Calculate the sum of digits in a number, for example for number 674 sum of digits is 6+7+4 = 17

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        System.out.print("The sum of the digits is: " + calculateSum(number));
        scanner.close();
    }

    public static int calculateSum(int number) {
        int sum = 0;

        if (number < 0) {
            number *= -1;
        }

        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }

        return sum;
    }
}
