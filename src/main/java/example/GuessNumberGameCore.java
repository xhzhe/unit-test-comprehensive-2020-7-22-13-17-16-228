package example;

public class GuessNumberGameCore {
    private static final String RIGHT_POSITION_CHARACTER = "A";
    private static final String WRONG_INPUT_INPUT_AGAIN = "Wrong Input，Input again";
    private static final String WRONG_INPUT_MESSAGE = WRONG_INPUT_INPUT_AGAIN;
    private static final String RIGHT_CHARACTER_COUNT = "B";
    private final String answer;
    private final ValidChecker validChecker;

    public GuessNumberGameCore(AnswerGenerator answerGenerator, ValidChecker validChecker) {
        this.answer = answerGenerator.generate();
        this.validChecker = validChecker;
    }

    public String guess(String guessNumber) {
        if (!validChecker.isValid(guessNumber)) {
            return WRONG_INPUT_MESSAGE;
        }
        int rightNumberCount = countRightNumber(guessNumber);
        int rightPositionCount = countRightPositionNumber(guessNumber);
        return rightPositionCount + RIGHT_POSITION_CHARACTER + (rightNumberCount - rightPositionCount) + RIGHT_CHARACTER_COUNT;
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
