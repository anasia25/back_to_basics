package java_basics.fundamentals;

import java.util.Random;
import java.util.Scanner;

public class FindYourNumber_13 {
    // Asks user for a number from 1 to 10, generates 10 random numbers from 1 to 10 until the number the user gave is found

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Pick a number from 1 to 10: ");
        int number = scanner.nextInt();

        boolean withinRange = false;

        while (!withinRange) {
            if (number < 1 || number > 10) {
                System.out.println("Number must be within the range 1-10!");
                System.out.println("Pick a number from 1 to 10: ");
                number = scanner.nextInt();
            } else {
                withinRange = true;
            }
        }

        boolean isFound = false;

        int temp;

        while (!isFound) {
            temp = random.nextInt(10) + 1;
            if (number == temp) {
                isFound = true;
                System.out.println("Number was found: " + temp);
            }
        }

        scanner.close();
    }
}
