package com.twschool.practice;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {
    FizzBuzz fizzBuzz = new FizzBuzz();
    @Test
    public void should_return_1_given_number_1() {
        String res = fizzBuzz.say(1);
        Assert.assertEquals("1", res);
    }

    @Test
    public void should_return_Fizz_given_number_3() {
        String res = fizzBuzz.say(3);
        Assert.assertEquals("Fizz", res);
    }

    @Test
    public void should_return_buzz_given_number_5() {
        String res = fizzBuzz.say(5);
        Assert.assertEquals("Buzz", res);
    }

    @Test
    public void should_return_FizzBuzzWhizz_given_number_105() {
        String res = fizzBuzz.say(105);
        Assert.assertEquals("FizzBuzzWhizz", res);
    }

    @Test
    public void should_returnFizz_given_number_35() {
        String res = fizzBuzz.say(35);
        Assert.assertEquals("Fizz", res);
    }
}
