package com.twschool.practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class GameGenerator {
    public String getNumber() {
        List<String> numbers = Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9", "0");

        Collections.shuffle(numbers);

        List result = numbers.subList(0, 4);

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < result.size(); i++) {
            sb.append(result.get(i));
        }

        return sb.toString();
    }
}
