package example;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class GuessNumberGameTest {
    @Test
    public void should_return_4A0B_when_guess_given_guess_number_1234_and_answer_1234() {
        //given
        String guessNumber = "1234";
        AnswerGenerator answerGenerator = mock(AnswerGenerator.class);
        given(answerGenerator.generate()).willReturn("1234");
        GuessNumberGame guessNumberGame = new GuessNumberGame(answerGenerator,new GuessGameValidChecker());
        //when
        String result = guessNumberGame.guess(guessNumber);
        //then
        assertEquals("4A0B", result);
    }

    @Test
    public void should_return_0A0B_when_guess_given_guess_number_5678_and_answer_1234() {
        //given
        String guessNumber = "5678";
        AnswerGenerator answerGenerator = mock(AnswerGenerator.class);
        given(answerGenerator.generate()).willReturn("1234");
        GuessNumberGame guessNumberGame = new GuessNumberGame(answerGenerator,new GuessGameValidChecker());
        //when
        String result = guessNumberGame.guess(guessNumber);
        //then
        assertEquals("0A0B", result);
    }

    @Test
    public void should_return_1A1B_when_guess_given_guess_number_1356_and_answer_1234() {
        //given
        String guessNumber = "1356";
        AnswerGenerator answerGenerator = mock(AnswerGenerator.class);
        given(answerGenerator.generate()).willReturn("1234");
        GuessNumberGame guessNumberGame = new GuessNumberGame(answerGenerator,new GuessGameValidChecker());
        //when
        String result = guessNumberGame.guess(guessNumber);
        //then
        assertEquals("1A1B", result);
    }

    @Test
    public void should_return_2A2B_when_guess_given_guess_number_1243_and_answer_1234() {
        //given
        String guessNumber = "1243";
        AnswerGenerator answerGenerator = mock(AnswerGenerator.class);
        given(answerGenerator.generate()).willReturn("1234");
        GuessNumberGame guessNumberGame = new GuessNumberGame(answerGenerator,new GuessGameValidChecker());
        //when
        String result = guessNumberGame.guess(guessNumber);
        //then
        assertEquals("2A2B", result);
    }

    @Test
    public void should_return_0A4B_when_guess_given_guess_number_4321_and_answer_1234() {
        //given
        String guessNumber = "4321";
        AnswerGenerator answerGenerator = mock(AnswerGenerator.class);
        given(answerGenerator.generate()).willReturn("1234");
        GuessNumberGame guessNumberGame = new GuessNumberGame(answerGenerator,new GuessGameValidChecker());
        //when
        String result = guessNumberGame.guess(guessNumber);
        //then
        assertEquals("0A4B", result);
    }

    @Test
    public void should_return_0A2B_when_guess_given_guess_number_4356_and_answer_1234() {
        //given
        String guessNumber = "4356";
        AnswerGenerator answerGenerator = mock(AnswerGenerator.class);
        given(answerGenerator.generate()).willReturn("1234");
        GuessNumberGame guessNumberGame = new GuessNumberGame(answerGenerator,new GuessGameValidChecker());
        //when
        String result = guessNumberGame.guess(guessNumber);
        //then
        assertEquals("0A2B", result);
    }

    @Test
    public void should_return_wrong_message_when_guess_number_given_1123() {
        //given
        String guessNumber = "1123";
        RandomNumberStringGenerator randomNumberStringGenerator = new RandomNumberStringGenerator();
        GuessNumberGame guessNumberGame = new GuessNumberGame(randomNumberStringGenerator,new GuessGameValidChecker());
        //when
        String result = guessNumberGame.guess(guessNumber);
        //then
        assertEquals("Wrong Input，Input again", result);
    }

}
