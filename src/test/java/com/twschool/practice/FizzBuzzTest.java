package com.twschool.practice;

import org.junit.Test;

public class FizzBuzzTest {

    @Test
    public void should_return_1_given_number_1() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        String res = fizzBuzz.say(1);
    }
}
