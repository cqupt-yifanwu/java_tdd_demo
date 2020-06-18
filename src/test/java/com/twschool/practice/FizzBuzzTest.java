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
    public void should_return_Buzz_given_number_60() {
        String result = fizzBuzz.say(60);
        Assert.assertEquals("FizzBuzz", result);
    }


    @Test
    public void should_return_Buzz_given_number_15() {
        String result = fizzBuzz.say(15);
        Assert.assertEquals("Buzz", result);
    }

    @Test
    public void should_return_FizzWhizz_given_number_21() {
        String result = fizzBuzz.say(21);
        Assert.assertEquals("FizzWhizz", result);
    }

    @Test
    public void should_return_BuzzWhizz_given_number() {
        String result = fizzBuzz.say(140);
        Assert.assertEquals("BuzzWhizz", result);
    }

    @Test
    public void should_return_FizzBuzzWhizz_given_number_210() {
        String result = fizzBuzz.say(210);
        Assert.assertEquals("FizzBuzzWhizz", result);
    }

    @Test
    public void should_return_BuzzWhizz_given_number_105() {
        String result = fizzBuzz.say(105);
        Assert.assertEquals("BuzzWhizz", result);
    }

    @Test
    public void should_return_Fizz_given_number_13() {
        String result = fizzBuzz.say(13);
        Assert.assertEquals("Fizz", result);
    }

    @Test
    public void should_return_Fizz_given_number_63() {
        String result = fizzBuzz.say(63);
        Assert.assertEquals("Fizz", result);
    }

    @Test
    public void should_return_BuzzFizz_given_number_35() {
        String result = fizzBuzz.say(35);
        Assert.assertEquals("BuzzWhizz", result);
    }

    @Test
    public void should_return_Buzz_given_number_135() {
        String result = fizzBuzz.say(135);
        Assert.assertEquals("Buzz", result);
    }

    @Test
    public void should_return_Buzz_given_number_25() {
        String result = fizzBuzz.say(25);
        Assert.assertEquals("Buzz", result);
    }

    @Test
    public void should_return_Fizz_given_number_75() {
        String result = fizzBuzz.say(75);
        Assert.assertEquals("Fizz", result);
    }
}
