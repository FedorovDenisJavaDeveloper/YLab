package task1;

import java.util.Scanner;

public class Stars {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int rowAmount = scanner.nextInt();
            int columnAmount = scanner.nextInt();
            String symbol = scanner.next();
            for (int i = 0; i < rowAmount; i++) {
                for (int j = 0; j < columnAmount; j++) {
                    System.out.print(symbol + " ");
                }
                System.out.println();
            }
        }
    }
}
