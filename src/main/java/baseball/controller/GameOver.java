package baseball.controller;

public enum GameOver {
    PLAY_NEW_GAME("1"),
    END_GAME("2");

    GameOver(String answer) {
    }

    public boolean isEndGame(){
        return this == END_GAME;
    }
}
