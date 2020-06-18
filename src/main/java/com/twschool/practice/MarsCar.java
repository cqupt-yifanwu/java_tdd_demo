package com.twschool.practice;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MarsCar {
    private int coordinatesX;
    private int coordinatesY;
    private String direction;

    private List<String> directions = Arrays.asList("N", "W", "S", "E");

    public MarsCar(MarsPosition marsPosition) {
        this.coordinatesX = marsPosition.getCoordinatesX();
        this.coordinatesY = marsPosition.getCoordinatesY();
        this.direction = marsPosition.getDirection();
    }


    public void execute(List args) {
        for(int index = 0; index < args.size(); index ++) {
            int nowPos = directions.indexOf(direction);
            if (args.get(index) == "L") {
                nowPos = nowPos + 1;

                if (nowPos > 3) {
                    nowPos = 0;
                }
            } else {
                nowPos = nowPos - 1;
                if (nowPos < 0) {
                    nowPos = 3;
                }
            }
            direction = directions.get(nowPos);
        }
    }


    public int getX() {
        return 0;
    }

    public int getY() {
        return 0;
    }

    public String getDirection() {
        return direction;
    }
}
