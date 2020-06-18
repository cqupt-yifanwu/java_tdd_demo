package com.twschool.practice;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {
    FizzBuzz fizzBuzz = new FizzBuzz();
    @Test
    public void should_return_1_given_number_1() {
        String result = fizzBuzz.say(1);
        Assert.assertEquals("1", result);
    }

    @Test
    public void should_return_Fizz_given_number_3() {
        String result = fizzBuzz.say(3);
        Assert.assertEquals("Fizz", result);
    }

    @Test
    public void should_return_buzz_given_number_5() {
        String result = fizzBuzz.say(5);
        Assert.assertEquals("Buzz", result);
    }

    @Test
    public void should_return_whizz_given_number_7() {
        String result = fizzBuzz.say(7);
        Assert.assertEquals("Whizz", result);
    }

    @Test
    public void should_return_fizzBuzz_given_number() {
        String result = fizzBuzz.say(15);
        Assert.assertEquals("FizzBuzz", result);
    }

    @Test
    public void should_return_FizzBuzzWhizz_given_number_105() {
        String result = fizzBuzz.say(105);
        Assert.assertEquals("FizzBuzzWhizz", result);
    }

    @Test
    public void should_return_Fizz_given_number_13() {
        String result = fizzBuzz.say(13);
        Assert.assertEquals("Fizz", result);
    }

    @Test
    public void should_return_BuzzFizz_given_number_35() {
        String result = fizzBuzz.say(35);
        Assert.assertEquals("BuzzWhizz", result);
    }

    @Test
    public void should_return_FizzBuzz_given_number_135() {
        String result = fizzBuzz.say(135);
        Assert.assertEquals("FizzBuzz", result);
    }
}
