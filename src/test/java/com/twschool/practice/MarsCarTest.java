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

    @Test
    public void should_return_0noun1S_given_00S_M() {
        MarsPosition marsPosition = new MarsPosition(0,0,"S");
        MarsCar marsCar = new MarsCar(marsPosition);

        List args = Arrays.asList("M");

        marsCar.execute(args);

        Assert.assertEquals(0, marsCar.getX());
        Assert.assertEquals(-1, marsCar.getY());
        Assert.assertEquals("S", marsCar.getDirection());
    }
    @Test
    public void should_return_10E_given_00E_M() {
        MarsPosition marsPosition = new MarsPosition(0,0,"E");
        MarsCar marsCar = new MarsCar(marsPosition);

        List args = Arrays.asList("M");

        marsCar.execute(args);

        Assert.assertEquals(1, marsCar.getX());
        Assert.assertEquals(0, marsCar.getY());
        Assert.assertEquals("E", marsCar.getDirection());
    }

    @Test
    public void should_return_03E_given_00E_MMMLMLM() {
        MarsPosition marsPosition = new MarsPosition(0,0,"E");
        MarsCar marsCar = new MarsCar(marsPosition);

        List args = Arrays.asList("M", "M", "M", "L", "M", "L", "M");

        marsCar.execute(args);

        Assert.assertEquals(2, marsCar.getX());
        Assert.assertEquals(1, marsCar.getY());
        Assert.assertEquals("W", marsCar.getDirection());
    }
}
