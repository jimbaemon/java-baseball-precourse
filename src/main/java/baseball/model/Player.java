package baseball.model;

import java.util.List;

public class Player {
    private final List<Integer> numbers;

    public Player(List<Integer> numbers) {
        validate(numbers);
        this.numbers = numbers;
    }

    private void validate(List<Integer> numbers) {
        if (numbers.size() > 3) {
            throw new IllegalArgumentException();
        }
    }

    public List<Integer> numbers() {
        return numbers;
    }
}
