package com.twschool.practice;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class HelloWorld {
    private List<String> numbers = Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9", "0");

    private int[] result = new int[4];

    public List<String> getNumbers() {
        Collections.shuffle(numbers);
        return numbers;
    }
}
