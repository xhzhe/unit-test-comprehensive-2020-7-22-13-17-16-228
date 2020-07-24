package example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RandomNumberStringGeneratorTest {
    @Test
    public void should_return_true_when_check_valid_given_random_class() {
        //given
        ValidChecker validChecker = new GuessGameValidChecker();
        AnswerGenerator answerGenerator = new RandomNumberStringGenerator();
        //when
        boolean result = validChecker.isValid(answerGenerator.generate());
        //then
        assertTrue(result);
    }
}
