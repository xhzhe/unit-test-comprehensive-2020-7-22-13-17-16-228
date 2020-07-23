package example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class GuessNumberGameTest {
    @Test
    public void should_return_4A0B_when_guess_given_guess_number_1234_and_answer_1234() {
        //given
        String guessNumber = "1234";
        String answer = "1234";
        GuessNumberGame guessNumberGame = new GuessNumberGame(answer);
        //when
        String result = guessNumberGame.guess(guessNumber);
        //then
        assertEquals("4A0B", result);
    }

    @Test
    public void should_return_0A0B_when_guess_given_guess_number_5678_and_answer_1234() {
        //given
        String guessNumber = "5678";
        String answer = "1234";
        GuessNumberGame guessNumberGame = new GuessNumberGame(answer);
        //when
        String result = guessNumberGame.guess(guessNumber);
        //then
        assertEquals("0A0B", result);
    }

    @Test
    public void should_return_1A1B_when_guess_given_guess_number_1356_and_answer_1234() {
        //given
        String guessNumber = "1356";
        String answer = "1234";
        GuessNumberGame guessNumberGame = new GuessNumberGame(answer);
        //when
        String result = guessNumberGame.guess(guessNumber);
        //then
        assertEquals("1A1B", result);
    }
}
