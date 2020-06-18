package com.twschool.practice;

public class FizzBuzz {
    public String say(int number) {
        if (!String.valueOf(number).contains("5") && String.valueOf(number).contains("3")) {
            return "Fizz";
        }

        String result = "";

        if (number % 3 == 0) {
            result += "Fizz";
        }

        if (number % 5 == 0) {
            result += "Buzz";
        }

        if (number % 7 == 0) {
            result += "Whizz";
        }

        if (!result.equals("")) {
             return result;
        }

        return String.valueOf(number);
    }
}
