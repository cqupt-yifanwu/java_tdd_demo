package com.twschool.practice;

public class FizzBuzz {
    public String say(int number) {
        String str = "";
        if (number % 3 == 0) {
            str += "Fizz";
        }

        if (number % 5 == 0) {
            str += "Buzz";
        }

        if (number % 7 == 0) {
            str += "Whizz";
        }

        if (!str.equals("")) {
             return str;
        }

        return String.valueOf(number);
    }
}
