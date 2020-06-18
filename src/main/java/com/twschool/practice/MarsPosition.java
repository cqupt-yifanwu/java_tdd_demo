package com.twschool.practice;

public class MarsPosition {

    private final int x;
    private final int y;
    private final String direction;

    public MarsPosition(int x, int y, String direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public int getCoordinatesX() {
        return x;
    }

    public int getCoordinatesY() {
        return y;
    }

    public String getDirection() {
        return direction;
    }
}
