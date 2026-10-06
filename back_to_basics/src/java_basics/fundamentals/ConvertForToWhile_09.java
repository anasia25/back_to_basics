package java_basics.fundamentals;

public class ConvertForToWhile_09 {
    // convert for cycle to while cycle

    public static void main(String[] args) {
        System.out.println("---- FOR ----");
        for (int i = 1; i <= 2; i++) {
            for (int j = 1; j <= 3; j++) {
                for (int k = 1; k <= 4; k++) {
                    System.out.print("*");
                }
                System.out.print("!");
            }
            System.out.println();
        }

        System.out.println("\n---- WHILE ----");
        int i = 1;
        int j = 1;
        int k = 1;

        while (i <= 2) {
            while (j <= 3) {
                while (k <= 4) {
                    System.out.print("*");
                    k++;
                }
                System.out.print("!");
                k = 1;
                j++;
            }
            System.out.println();
            j = 1;
            i++;
        }
    }
}
