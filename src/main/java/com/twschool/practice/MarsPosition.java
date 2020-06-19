package com.twschool.practice;

public class MarsPosition {

    private int x;
    private int y;
    private Direction direction;

    public MarsPosition(int x, int y, Direction direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public void changeCoordinatesY (String type) {
        if ("add".equals(type)) {
            y++;
            return;
        }
        y--;
    }

    public void changeCoordinatesX (String type) {
        if ("add".equals(type)) {
            x++;
            return;
        }
        x--;
    }

    public void setDirection (Direction dirction) {
        this.direction = dirction;
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
