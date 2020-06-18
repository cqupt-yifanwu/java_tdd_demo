package com.twschool.practice;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class MarsCarTest {
    @Test
    public void should_return_00W_given_00N_L() {
        MarsPosition marsPosition = new MarsPosition(0, 0, "N");
        MarsCar marsCar = new MarsCar(marsPosition);

        List args = Arrays.asList("L");

        marsCar.execute(args);

        Assert.assertEquals(0, marsCar.getX());
        Assert.assertEquals(0, marsCar.getY());
        Assert.assertEquals("W", marsCar.getDirection());
    }


}
