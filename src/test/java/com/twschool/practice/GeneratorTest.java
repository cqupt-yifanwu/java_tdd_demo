package com.twschool.practice;

import org.junit.Assert;
import org.junit.Test;

public class GeneratorTest {
    @Test
    public void should_return_numbers_length4_when_run_generator() {
        RandomGameGenerator randomGameGenerator = new RandomGameGenerator();
        String result = randomGameGenerator.getNumber();
        Assert.assertEquals(4, result.length());
    }

    @Test
//    判断每一项都不相等，不会重复出现
    public void should_return_number_diff_any_position_when_run_generator() {
        RandomGameGenerator randomGameGenerator = new RandomGameGenerator();
        String result = randomGameGenerator.getNumber();

        for(int i = 0; i < result.length(); i ++) {
            Assert.assertEquals(result.indexOf(result.charAt(i)), i);
            Assert.assertEquals(result.lastIndexOf(result.charAt(i)), i);
        }
    }
}
