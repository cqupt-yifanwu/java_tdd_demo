package com.twschool.practice;

public class GuessNumberGame {
    private final GameAnswer gameAnswer;
    private GameStatus gameStatus = GameStatus.CONTINUE;
    private int leftTryTimes = 6;

    public GuessNumberGame(GameGenerator gameGenerator) {
        String randomGameAnswer = gameGenerator.getNumber();
        this.gameAnswer = new GameAnswer(randomGameAnswer);
    }

    private void decreaseTryTimes() {
        leftTryTimes --;
    }

    private void modifyStatus(String result) {
        if ("4A0B".equals(result)) {
            gameStatus = GameStatus.SUCCEED;
        } else if (leftTryTimes == 0) {
            System.out.println("结束，正确答案是" + gameAnswer.getGameAnswer());
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
