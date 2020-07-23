package example;

import java.util.ArrayList;
import java.util.Random;

public class RandomNumberStringGenerator implements AnswerGenerator {
    @Override
    public String generate() {
        StringBuilder answer = new StringBuilder();
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }
        Random random = new Random(System.currentTimeMillis());
        for (int i = 0; i < 4; i++) {
            int index = random.nextInt(numbers.size());
            answer.append(numbers.get(index));
            numbers.remove(index);
        }
        return answer.toString();
    }
}
