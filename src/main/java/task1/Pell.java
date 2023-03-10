package task1;

import java.util.Scanner;

public class Pell {
    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(System.in)) {
            int numberPell = scanner.nextInt();
            if (numberPell <= 0 || numberPell == 1) {
                if (numberPell <= 0) {
                    System.out.format("Pell number for %d -> 0\n", numberPell);
                } else {
                    System.out.format("Pell number for %d -> 1\n", numberPell);
                }
            } else {
                int[] arrayPell = new int[numberPell + 1];
                arrayPell[0] = 0;
                arrayPell[1] = 1;
                for (int i = 2; i <= numberPell; i++) {
                    arrayPell[i] = 2 * arrayPell[i - 1] + arrayPell[i - 2];
                }
                System.out.format("Pell number for %d -> %d\n", numberPell, arrayPell[numberPell]);
            }
        }
    }
}
