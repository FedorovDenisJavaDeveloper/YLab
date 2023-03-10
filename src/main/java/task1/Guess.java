package task1;

import java.util.Random;
import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {
        int guessNumber = new Random().nextInt(100);
        int attempts = 10;
        System.out.format("Я загадал число. У тебя %d попыток угадать.\n", attempts);
        try (Scanner scanner = new Scanner(System.in)) {
            int i = attempts;
            int answerNumber = -1;
            while (i > 0 && answerNumber != guessNumber) {
                i--;
                answerNumber = scanner.nextInt();
                if (answerNumber != guessNumber) {
                    if (answerNumber > guessNumber) {
                        System.out.print("Мое число меньше! ");
                    } else {
                        System.out.print("Мое число больше! ");
                    }
                    System.out.format("Осталось %d попыток.\n", i);
                } else {
                    System.out.format("Ты угадал с %d попытки :-)\n", attempts - i);
                }
            }
            if (i == 0 && answerNumber != guessNumber) {
                System.out.println("Ты не угадал :-(");
            }
        }
    }
}
