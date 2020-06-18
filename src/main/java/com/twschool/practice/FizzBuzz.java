package com.twschool.practice;

public class FizzBuzz {
    public String say(int number) {
        if (number % 3 == 0) {
            return String.valueOf("Fizz");
        }

        if (number % 5 == 0) {
            return String.valueOf("Buzz");
        }

        return String.valueOf(1);
    }
}
