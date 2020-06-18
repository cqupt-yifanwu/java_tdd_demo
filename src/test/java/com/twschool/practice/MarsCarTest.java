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

    @Test
    public void should_return_00E_given_00N_R() {
        MarsPosition marsPosition = new MarsPosition(0,0,"N");
        MarsCar marsCar = new MarsCar(marsPosition);

        List args = Arrays.asList("R");

        marsCar.execute(args);

        Assert.assertEquals(0, marsCar.getX());
        Assert.assertEquals(0, marsCar.getY());
        Assert.assertEquals("E", marsCar.getDirection());
    }

    @Test
    public void should_return_01N_given_00N_M() {
        MarsPosition marsPosition = new MarsPosition(0,0,"N");
        MarsCar marsCar = new MarsCar(marsPosition);

        List args = Arrays.asList("M");

        marsCar.execute(args);

        Assert.assertEquals(0, marsCar.getX());
        Assert.assertEquals(1, marsCar.getY());
        Assert.assertEquals("N", marsCar.getDirection());
    }

    @Test
    public void should_return_noun10W_given_00W_M() {
        MarsPosition marsPosition = new MarsPosition(0,0,"W");
        MarsCar marsCar = new MarsCar(marsPosition);

        List args = Arrays.asList("M");

        marsCar.execute(args);

        Assert.assertEquals(-1, marsCar.getX());
        Assert.assertEquals(0, marsCar.getY());
        Assert.assertEquals("W", marsCar.getDirection());
    }
}
