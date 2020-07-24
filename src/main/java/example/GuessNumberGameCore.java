package example;

import java.util.Scanner;

public class GuessNumberGameCore {
    private final String answer;
    private final ValidChecker validChecker;

    public GuessNumberGameCore(AnswerGenerator answerGenerator, ValidChecker validChecker) {
        this.answer = answerGenerator.generate();
        this.validChecker = validChecker;
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
        for (int index = 0; index < guessNumber.length(); index++) {
            if (this.answer.indexOf(guessNumber.charAt(index)) != -1) {
                count++;
            }
        }
        return count;
    }

    private int countRightPositionNumber(String guessNumber) {
        int count = 0;
        for (int index = 0; index < guessNumber.length(); index++) {
            if (this.answer.charAt(index) == guessNumber.charAt(index)) {
                count++;
            }
        }
        return count;
    }
}
