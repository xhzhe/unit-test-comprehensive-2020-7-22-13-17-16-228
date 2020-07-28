package example;

import java.util.ArrayList;
import java.util.Random;

public class RandomNumberStringGenerator implements AnswerGenerator {

    private static final int NUMBER_COUNT = 10;
    private static final int ANSWER_LENGTH = 4;

    @Override
    public String generate() {
        StringBuilder answer = new StringBuilder();
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int index = 0; index < NUMBER_COUNT; index++) {
            numbers.add(index);
        }
        Random random = new Random(System.currentTimeMillis());
        for (int i = 0; i < ANSWER_LENGTH; i++) {
            int index = random.nextInt(numbers.size());
            answer.append(numbers.get(index));
            numbers.remove(index);
        }
        return answer.toString();
    }
}
