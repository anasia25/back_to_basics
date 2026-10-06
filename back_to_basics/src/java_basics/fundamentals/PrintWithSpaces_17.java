package java_basics.fundamentals;

import java.util.Scanner;

public class PrintWithSpaces_17 {
    // Read number and print it with a space in between each digit for example number is 8976 it will print 8 9 7 6

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        System.out.println("\n-------- FORMATTED NUMBER --------");

        printSpaces(number);

        scanner.close();
    }

    public static void printSpaces(int number) {
        if (number < 0) {
            number *= -1;
            System.out.print("- ");
        }

        if (number == 0) {
            System.out.print("0");
        } else {
            StringBuilder reversedNumberString = new StringBuilder();

            while (number != 0) {
                reversedNumberString.append(number % 10);
                number /= 10;
            }

            for (int i = reversedNumberString.length() - 1; i >= 0; i--) {
                System.out.print(reversedNumberString.charAt(i) + " ");
            }
        }
    }
}
