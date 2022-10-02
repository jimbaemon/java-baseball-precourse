package baseball.model;

import java.util.List;

public class Computer {
    private final List<Integer> numbers;
    private final GameResult gameResult;

    public Computer(NumberGenerator numberGenerator) {
        this.numbers = numberGenerator.generate();
        this.gameResult = GameResult.init();
    }

    public GameResult judge(List<Integer> playerNumbers) {
        for (int i = 0; i < playerNumbers.size(); i++) {
            judge(playerNumbers.get(i), numbers.get(i));
        }
        return gameResult;
    }

    private void judge(int playerNumber, int computerNumber) {
        if (playerNumber == computerNumber) {
            gameResult.addStrike();
        } else if (numbers.contains(playerNumber)) {
            gameResult.addBall();
        }
    }


}
