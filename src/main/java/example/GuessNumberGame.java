package example;

import java.util.Scanner;

public class GuessNumberGame {
    private final String answer;

    public GuessNumberGame(AnswerGenerator answerGenerator) {
        this.answer = answerGenerator.generate();
    }

    public GuessNumberGame(String answer) {
        this.answer = answer;
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
        if (!isGuessNumberValid(guessNumber)) {
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

    public boolean isGuessNumberValid(String guessNumber) {
        if (guessNumber.length() != 4) {
            return false;
        }
        if (!isAllNumber(guessNumber)) {
            return false;
        }
        for (int i = 0; i < guessNumber.length(); i++) {
            for (int j = i + 1; j < guessNumber.length(); j++) {
                if (guessNumber.charAt(i) == guessNumber.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean isAllNumber(String number) {
        for (int i = 0; i < number.length(); i++) {
            if (!Character.isDigit(number.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
