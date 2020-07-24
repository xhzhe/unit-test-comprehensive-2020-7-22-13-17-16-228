package example;

public class GuessGameValidChecker implements ValidChecker {
    @Override
    public boolean isValid(String guessNumber) {
        if (guessNumber.length() != 4) {
            return false;
        }
        if (!isAllNumber(guessNumber)) {
            return false;
        }
        return !isRepeat(guessNumber);
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
        for (int i = 0; i < number.length(); i++) {
            if (!Character.isDigit(number.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
