package java_basics.fundamentals;

import java.util.Scanner;

public class Sum_Multp_Calc_02 {
    // calculating the sum and product of two numbers

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int no_1 = scanner.nextInt();

        System.out.println("Enter the second number: ");
        int no_2 = scanner.nextInt();

        System.out.println("Enter the operation: ");
        char operation = scanner.next().charAt(0);

        if(operation == '+') {
            System.out.println("The sum of " + no_1 + " and " + no_2 + " is: " + sumCalculator(no_1, no_2));
        } else if(operation == '*') {
            System.out.println("The product of " + no_1 + " and " + no_2 + " is: " + multiplicationCalculator(no_1, no_2));
        } else {
            System.out.println("Invalid operation");
        }

        scanner.close();
    }

    public static int sumCalculator(int no_1, int no_2) {
        return no_1 + no_2;
    }

    public static int multiplicationCalculator(int no_1, int no_2) {
        return no_1 * no_2;
    }
}
