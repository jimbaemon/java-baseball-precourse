package baseball.model;

public class Game {
    private final Computer computer;
    private final Player player;

    public Game(Computer computer, Player player) {
        this.computer = computer;
        this.player = player;
    }

    public GameResult play(){
        return computer.judge(player.numbers());
    }


}
