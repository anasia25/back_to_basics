package java_basics.fundamentals;

import java.util.Scanner;

public class PIN_12 {
    // Password is 3454

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter password (4 DIGITS ONLY!): ");
        int password = scanner.nextInt();

        boolean fourDigits = false;

        while (!fourDigits) {
            if (password < 1000 || password > 9999) {
                System.out.println("Password must have 4 digits!");
                System.out.println("Enter password: ");
                password = scanner.nextInt();
            } else {
                fourDigits = true;
            }
        }

        if (password != 3454) {
            System.out.println("Password incorrect!");
        } else {
            System.out.println("Success!");
        }

        scanner.close();
    }
}
