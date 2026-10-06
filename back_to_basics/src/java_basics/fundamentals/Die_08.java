package java_basics.fundamentals;

import java.util.Random;
import java.util.Scanner;

public class Die_08 {
    // Number of times each die face shows up

    public static void main(String[] args) {
        int[] numbers = throwDie();
        calculateAmount(numbers);
    }

    public static int[] throwDie() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many times to throw the die? ");
        int amount = scanner.nextInt();

        scanner.close();

        int[] numberThrown;

        if (amount < 0) {
            numberThrown = null;
        } else {

            numberThrown = new int[amount];

            for (int i = 0; i < amount; i++) {
                numberThrown[i] = random.nextInt(6) + 1;
            }
        }

        return numberThrown;
    }

    public static void calculateAmount(int[] numbers) {
        if (numbers != null) {
            int one = 0;
            int two = 0;
            int three = 0;
            int four = 0;
            int five = 0;
            int six = 0;

            for (int num : numbers) {
                if (num == 1) {
                    one++;
                } else if (num == 2) {
                    two++;
                } else if (num == 3) {
                    three++;
                } else if (num == 4) {
                    four++;
                } else if (num == 5) {
                    five++;
                } else {
                    six++;
                }
            }

            System.out.println("\n---- NUMBER OF TIMES ----");
            System.out.println("1: " + one);
            System.out.println("2: " + two);
            System.out.println("3: " + three);
            System.out.println("4: " + four);
            System.out.println("5: " + five);
            System.out.println("6: " + six);
        } else {
            System.out.println("Invalid amount");
        }
    }
}
