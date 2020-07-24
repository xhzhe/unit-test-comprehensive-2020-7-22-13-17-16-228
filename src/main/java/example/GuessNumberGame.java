package example;

import java.util.Scanner;

public class GuessNumberGame implements Game {
    private final GuessNumberGameCore guessNumberGameCore;

    GuessNumberGame(GuessNumberGameCore guessNumberGameCore) {
        this.guessNumberGameCore = guessNumberGameCore;
    }

    @Override
    public void play() {
        Scanner scanner = new Scanner(System.in);
        for (int times = 0; times < 6; times++) {
            String guessNumber = scanner.next();
            System.out.println(guessNumberGameCore.guess(guessNumber));
        }
        System.out.println("game over");
    }
}
