package com.twschool.practice;

import org.junit.Assert;
import org.junit.Test;

public class GameAnswerTest {
    @Test
    public void should_4A0B_given_gameAnswer_1234_userAnswer_1234() {
        GameAnswer answer = new GameAnswer("1234");

        String result = answer.check("1234");

        Assert.assertEquals("4A0B", result);
    }

    @Test
    public void should_1A3B_given_gameAnswer_1234_userAnswer_1423() {
        GameAnswer answer = new GameAnswer("1234");

        String result = answer.check("1423");

        Assert.assertEquals("1A3B", result);
    }

    @Test
    public void should_1A1B_given_gameAnswer_1234_userAnswer_1456() {
        GameAnswer answer = new GameAnswer("1234");

        String result = answer.check("1456");

        Assert.assertEquals("1A1B", result);
    }

    @Test
    public void should_0A4B_given_gameAnswer_1234_userAnswer_4321() {
        GameAnswer answer = new GameAnswer("1234");

        String result = answer.check("4321");

        Assert.assertEquals("0A4B", result);
    }

    @Test
    public void should_0A3B_given_gameAnswer_1234_userAnswer_4326() {
        GameAnswer answer = new GameAnswer("1234");

        String result = answer.check( "4326");

        Assert.assertEquals("0A3B", result);
    }

    @Test
    public void should_0A0B_given_gameAnswer_1234_userAnswer_4567() {
        GameAnswer answer = new GameAnswer("1234");

        String result = answer.check("8567");

        Assert.assertEquals("0A0B", result);
    }
}
