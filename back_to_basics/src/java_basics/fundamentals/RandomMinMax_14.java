package java_basics.fundamentals;

import java.util.Random;

public class RandomMinMax_14 {
    // 10 randomly generated numbers from 10 to 100, find max and min

    public static void main(String[] args) {
        Random random = new Random();

        int[] array = new int[10];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10, 101);
            if (array[i] > max) {
                max = array[i];
            }

            if (array[i] < min) {
                min = array[i];
            }
        }

        System.out.println("Min: " + min + " and Max: " + max);
    }
}
