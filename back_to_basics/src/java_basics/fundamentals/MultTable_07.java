package java_basics.fundamentals;

import java.util.Scanner;

public class MultTable_07 {
    // Multiplication table

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = scanner.nextInt();

        scanner.close();

        for (int i = 0; i < 11; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }
    }
}
