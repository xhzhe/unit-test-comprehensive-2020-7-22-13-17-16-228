package example;

import java.util.Scanner;

public class GuessNumberGame implements Game {
    private static final int GAME_TIMES = 6;
    public static final String GAME_OVER = "game over";
    private final GuessNumberGameCore guessNumberGameCore;

    GuessNumberGame(GuessNumberGameCore guessNumberGameCore) {
        this.guessNumberGameCore = guessNumberGameCore;
    }

    @Override
    public void play() {
        Scanner scanner = new Scanner(System.in);
        for (int times = 0; times < GAME_TIMES; times++) {
            String guessNumber = scanner.next();
            System.out.println(guessNumberGameCore.guess(guessNumber));
        }
        System.out.println(GAME_OVER);
    }
}
