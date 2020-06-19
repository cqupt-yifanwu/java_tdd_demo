package com.twschool.practice;

public class GuessNumberGame {
    private final GameAnswer gameAnswer;
    private GameStatus gameStatus = GameStatus.CONTINUE;
    private int leftTryTimes = 6;

    public GuessNumberGame(GameAnswer gameAnswer) {
        this.gameAnswer = gameAnswer;
    }

    private void decreaseTryTimes() {
        leftTryTimes --;
    }

    private void modifyStatus(String result) {
        if ("4A0B".equals(result)) {
            gameStatus = GameStatus.SUCCEED;
        } else if (leftTryTimes == 0) {
            gameStatus = GameStatus.FAILED;
        }
    }

    public String guess(String userAnswerString) {
        String result = gameAnswer.check(userAnswerString);
        decreaseTryTimes();
        modifyStatus(result);
        return result;
    }

    public GameStatus getStatus() {
        return gameStatus;
    }
}
