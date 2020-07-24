package example;

import java.util.Scanner;

public class GuessNumberGame {
    private final String answer;
    private final ValidChecker validChecker;

    public GuessNumberGame(AnswerGenerator answerGenerator, ValidChecker validChecker) {
        this.answer = answerGenerator.generate();
        this.validChecker = validChecker;
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            String guessNumber = scanner.next();
            System.out.println(guess(guessNumber));
        }
        System.out.println("game over");
    }

    public String guess(String guessNumber) {
        if (!validChecker.isValid(guessNumber)) {
            return "Wrong Input，Input again";
        }
        int rightNumberCount = countRightNumber(guessNumber);
        int rightPositionCount = countRightPositionNumber(guessNumber);
        return rightPositionCount + "A" + (rightNumberCount - rightPositionCount) + "B";
    }

    private int countRightNumber(String guessNumber) {
        int count = 0;
        for (int i = 0; i < guessNumber.length(); i++) {
            if (this.answer.indexOf(guessNumber.charAt(i)) != -1) {
                count++;
            }
        }
        return count;
    }

    private int countRightPositionNumber(String guessNumber) {
        int count = 0;
        for (int i = 0; i < guessNumber.length(); i++) {
            if (this.answer.charAt(i) == guessNumber.charAt(i)) {
                count++;
            }
        }
        return count;
    }
}
