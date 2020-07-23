package example;

public class GuessNumberGame {
    private String answer;

    public GuessNumberGame(String answer) {
        this.answer = answer;
    }

    public String guess(String guessNumber) {
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
