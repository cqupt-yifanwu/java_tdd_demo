package com.twschool.practice;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GuessNumberGameTest {
    GameAnswer gameAnswer;
    GuessNumberGame guessNumberGame;

    @Before
    public void setUp() throws Exception {
        GameGenerator gameGenerator = new GameGenerator() {
            @Override
            public String getNumber() {
                return "1234";
            }
        };
        guessNumberGame = new GuessNumberGame(gameGenerator);
    }

    @Test
    public void should_return_succeed_when_get_status_input_1234_given_game_with_answer_1234() {

        String result = guessNumberGame.guess("1234");

        GameStatus status = guessNumberGame.getStatus();

        Assert.assertEquals(GameStatus.SUCCEED, status);
    }

    @Test
    public void should_return_succeed_when_get_status_input_1234_given_game_with_answer_1256() {
        String result = guessNumberGame.guess("1256");

        GameStatus status = guessNumberGame.getStatus();

        Assert.assertEquals(GameStatus.CONTINUE, status);
    }

    @Test
    public void should_return_succeed_when_get_status_input_1234_given_game_with_answer_1256_6times() {

        guessNumberGame.guess("1256");
        guessNumberGame.guess("1256");
        guessNumberGame.guess("1256");
        guessNumberGame.guess("1256");
        guessNumberGame.guess("1256");
        guessNumberGame.guess("1256");

        GameStatus status = guessNumberGame.getStatus();

        Assert.assertEquals(GameStatus.FAILED, status);
    }

}
