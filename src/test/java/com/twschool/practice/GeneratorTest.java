package com.twschool.practice;

import org.junit.Assert;
import org.junit.Test;

public class GeneratorTest {
    @Test
    public void should_return_numbers_length4_when_run_generator() {
        GameGenerator gameGenerator = new GameGenerator();
        String result = gameGenerator.getNumber();
        Assert.assertEquals(4, result.length());
    }
}
