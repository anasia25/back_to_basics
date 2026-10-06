package java_basics.fundamentals;

import java.util.Scanner;

public class ReplaceValues_04 {
    // Replace the values of two variables using a temp variable and not using a temp variable

    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first value: ");
        int v1 = scanner.nextInt();

        System.out.print("Enter the second value: ");
        int v2 = scanner.nextInt();

        replaceValuesTemp(v1, v2);
        replaceValues(v1, v2);
    }

    public static void replaceValuesTemp(int v1, int v2) {
        int temp = v1;

        v1 = v2;
        v2 = temp;

        System.out.println("First variable: " + v1 + ", second variable: " + v2 + ".");
    }

    public static void replaceValues(int v1, int v2) {
        v1 = v1 + v2;
        v2 = v1 - v2;
        v1 = v1 - v2;

        System.out.println("First variable: " + v1 + ", second variable: " + v2 + ".");
    }
}
