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
}
