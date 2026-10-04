package java_basics.fundamentals;

import java.util.Scanner;

public class SumCalc_02 {
    // calculating the sum and addition of two numbers

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int no_1 = scanner.nextInt();

        System.out.println("Enter the second number: ");
        int no_2 = scanner.nextInt();

        System.out.println("Enter the operation: ");
        char operation = scanner.next().charAt(0);

        if(operation == '+') {
            System.out.println("The sum of " + no_1 + " and " + no_2 + " is ");
        }

    }

    public int sumCalculator(int no_1, int no_2) {
        return no_1 + no_2;
    }

    public int additionCalculator(int no_1, int no_2) {
        return no_1 * no_2;
    }
}
