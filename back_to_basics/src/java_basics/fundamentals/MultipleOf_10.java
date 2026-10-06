package java_basics.fundamentals;

import java.util.Scanner;

public class MultipleOf_10 {
    // Find out if first number multiple of the second one

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int no_1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int no_2 = scanner.nextInt();

        scanner.close();

        boolean isMultipleOf = isMultipleOf(no_1, no_2);

        if (isMultipleOf) {
            System.out.println("\n" + no_2 + " is a multiple of " + no_1);
        } else {
            System.out.println("\n" + no_2 + " is not a multiple of " + no_1);
        }
    }

    public static boolean isMultipleOf(int no_1, int no_2) {
        return no_2 % no_1 == 0;
    }
}