package com.twschool.practice;

public class FizzBuzz {
    public String say(int number) {
        String formatNumber = String.valueOf(number);

        if (!formatNumber.contains("5") && formatNumber.contains("3")) {
            return "Fizz";
        }

        String result = "";


        if (number % 3 == 0 && (!formatNumber.contains("5") || formatNumber.contains("7"))) {
            result += "Fizz";
        }

        if (number % 5 == 0 && !formatNumber.contains("7")) {
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
