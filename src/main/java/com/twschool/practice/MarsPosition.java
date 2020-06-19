package com.twschool.practice;

public class MarsPosition {

    private final int x;
    private final int y;
    private final Direction direction;

    public MarsPosition(int x, int y, Direction direction) {
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

    public Direction getDirection() {
        return direction;
    }
}
