package java_basics.fundamentals;

import java.util.Scanner;

public class CompareNumbers_05 {
    // Comparing two integers

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int no_1 = scanner.nextInt();

        System.out.print("Enter another integer: ");
        int no_2 = scanner.nextInt();

        scanner.close();

        compareIntegers(no_1, no_2);
    }

    public static void compareIntegers(int no_1, int no_2) {
        if (no_1 > no_2) {
            System.out.println(no_1 + " > " + no_2);
        } else if (no_1 < no_2) {
            System.out.println(no_1 + " < " + no_2);
        } else {
            System.out.println(no_1 + " = " + no_2);
        }
    }
}
