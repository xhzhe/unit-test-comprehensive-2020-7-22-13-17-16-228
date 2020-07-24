package example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class GuessGameValidCheckerTest {
    @Test
    public void should_return_false_when_check_number_valid_given_abcd() {
        //given
        String guessNumber = "abcd";
        ValidChecker validChecker = new GuessGameValidChecker();
        //when
        boolean result = validChecker.isValid(guessNumber);
        //then
        assertFalse(result);
    }

    @Test
    public void should_return_false_when_check_number_valid_given_12() {
        //given
        String guessNumber = "12";
        ValidChecker validChecker = new GuessGameValidChecker();
        //when
        boolean result = validChecker.isValid(guessNumber);
        //then
        assertFalse(result);
    }

    @Test
    public void should_return_false_when_check_number_valid_given_1123() {
        //given
        String guessNumber = "1123";
        ValidChecker validChecker = new GuessGameValidChecker();
        //when
        boolean result = validChecker.isValid(guessNumber);
        //then
        assertFalse(result);
    }
}
