package com.twschool.practice;

import org.junit.Assert;
import org.junit.Test;

public class GuessNumberGameTest {
    @Test
    public void should_return_succeed_when_get_status_input_1234_given_game_with_answer_1234() {
        GameAnswer gameAnswer = new GameAnswer("1234");
        GuessNumberGame guessNumberGame = new GuessNumberGame(gameAnswer);
        String result = guessNumberGame.guess("1256");

        GameStatus status = guessNumberGame.getStatus(result);

        Assert.assertEquals(GameStatus.SUCCEED, status);
    }
}
