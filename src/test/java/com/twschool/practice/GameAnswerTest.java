package com.twschool.practice;

import org.junit.Assert;
import org.junit.Test;

public class GameAnswerTest {
    @Test
    public void should_4A0B_given_gameAnswer_1234_userAnswer_1234() {
        GameAnswer answer = new GameAnswer();

        String result = answer.check("1234", "1234");

        Assert.assertEquals("4A0B", result);
    }

    @Test
    public void should_1A3B_given_gameAnswer_1234_userAnswer_1423() {
        GameAnswer answer = new GameAnswer();

        String result = answer.check("1234", "1423");

        Assert.assertEquals("1A3B", result);
    }

    @Test
    public void should_1A1B_given_gameAnswer_1234_userAnswer_1456() {
        GameAnswer answer = new GameAnswer();

        String result = answer.check("1234", "1456");

        Assert.assertEquals("1A1B", result);
    }
}
