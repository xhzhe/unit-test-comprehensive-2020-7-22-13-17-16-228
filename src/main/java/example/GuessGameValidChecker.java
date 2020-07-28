package example;

public class GuessGameValidChecker implements ValidChecker {

    private static final int ANSWER_LENGTH = 4;

    @Override
    public boolean isValid(String guessNumber) {
        return guessNumber.length() == ANSWER_LENGTH && isAllNumber(guessNumber) && (!isRepeat(guessNumber));
    }

    private boolean isRepeat(String string) {
        boolean[] numberSet = new boolean[10];
        for (byte charByte : string.getBytes()) {
            if (numberSet[charByte - '0']) {
                return true;
            } else {
                numberSet[charByte - '0'] = true;
            }
        }
        return false;
    }

    private boolean isAllNumber(String number) {
        for (int index = 0; index < number.length(); index++) {
            if (!Character.isDigit(number.charAt(index))) {
                return false;
            }
        }
        return true;
    }
}
