package com.twschool.practice;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class MarsCarTest {
    @Test
    public void should_return_x_0_y_0_direction_W_given_x_0y_0_direcion_N_commonds_L() {
        MarsPosition marsPosition = new MarsPosition(0, 0, "N");
        MarsCar marsCar = new MarsCar(marsPosition);

        List args = Arrays.asList("L");

        marsCar.execute(args);

        Assert.assertEquals(0, marsCar.getX());
        Assert.assertEquals(0, marsCar.getY());
        Assert.assertEquals("W", marsCar.getDirection());
    }

    @Test
    public void should_return_x_0_y_0_direction_E_given_x_0_y_0_directionN_commonds_R() {
        MarsPosition marsPosition = new MarsPosition(0,0,"N");
        MarsCar marsCar = new MarsCar(marsPosition);

        List args = Arrays.asList("R");

        marsCar.execute(args);

        Assert.assertEquals(0, marsCar.getX());
        Assert.assertEquals(0, marsCar.getY());
        Assert.assertEquals("E", marsCar.getDirection());
    }

    @Test
    public void should_return_x_0_y_1_direction_N_given_x_0_y_0_direction_N_commonds_M() {
        MarsPosition marsPosition = new MarsPosition(0,0,"N");
        MarsCar marsCar = new MarsCar(marsPosition);

        List args = Arrays.asList("M");

        marsCar.execute(args);

        Assert.assertEquals(0, marsCar.getX());
        Assert.assertEquals(1, marsCar.getY());
        Assert.assertEquals("N", marsCar.getDirection());
    }

    @Test
    public void should_return_x_noun1_y_0_direction_W_given_x_0y_0_directionW_commomnds_M() {
        MarsPosition marsPosition = new MarsPosition(0,0,"W");
        MarsCar marsCar = new MarsCar(marsPosition);

        List args = Arrays.asList("M");

        marsCar.execute(args);

        Assert.assertEquals(-1, marsCar.getX());
        Assert.assertEquals(0, marsCar.getY());
        Assert.assertEquals("W", marsCar.getDirection());
    }

    @Test
    public void should_return_x_0_y_noun1_direction_S_given_x_0y_0_direction_S_commonds_M() {
        MarsPosition marsPosition = new MarsPosition(0,0,"S");
        MarsCar marsCar = new MarsCar(marsPosition);

        List args = Arrays.asList("M");

        marsCar.execute(args);

        Assert.assertEquals(0, marsCar.getX());
        Assert.assertEquals(-1, marsCar.getY());
        Assert.assertEquals("S", marsCar.getDirection());
    }
    @Test
    public void should_return_x_1_0_direction_E_given_x_0y_0_directionE_commonds_M() {
        MarsPosition marsPosition = new MarsPosition(0,0,"E");
        MarsCar marsCar = new MarsCar(marsPosition);

        List args = Arrays.asList("M");

        marsCar.execute(args);

        Assert.assertEquals(1, marsCar.getX());
        Assert.assertEquals(0, marsCar.getY());
        Assert.assertEquals("E", marsCar.getDirection());
    }

    @Test
    public void should_return_x_0_y_3_direciton_E_given_x_0_y_0_direction_E_commonds_MMMLMLM() {
        MarsPosition marsPosition = new MarsPosition(0,0,"E");
        MarsCar marsCar = new MarsCar(marsPosition);

        List args = Arrays.asList("M", "M", "M", "L", "M", "L", "M");

        marsCar.execute(args);

        Assert.assertEquals(2, marsCar.getX());
        Assert.assertEquals(1, marsCar.getY());
        Assert.assertEquals("W", marsCar.getDirection());
    }
}
