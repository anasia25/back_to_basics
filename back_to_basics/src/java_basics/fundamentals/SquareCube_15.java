package java_basics.fundamentals;

import java.util.Scanner;

public class SquareCube_15 {
    // Calculate the square and cube of numbers

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        squareCube(number);

        scanner.close();
    }

    public static void squareCube(int number) {
        System.out.printf("%n%-8s %-10s %-10s%n", "Number", "Squared", "Cubed");
        System.out.println("--------------------------------");

        if (number >= 0) {
            for (int i = 0; i <= number; i++) {
                long square = (long) i * i;
                long cube = (long) i * i * i;

                System.out.printf("%-8d %-10d %-10d%n", i, square, cube);
            }
        } else {
            for (int i = number; i <= 0; i++) {
                long square = (long) i * i;
                long cube = (long) i * i * i;

                System.out.printf("%-8d %-10d %-10d%n", i, square, cube);
            }
        }

    }
}
