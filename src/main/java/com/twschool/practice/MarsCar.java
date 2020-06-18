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

    public void execute(List<String> args) {
        for(int index = 0; index < args.size(); index ++) {
            int nowPos = directions.indexOf(direction);
            String command = args.get(index);
            if (command.equals("M")) {
                if (direction.equals("N")) {
                    coordinatesY += 1;
                }

                if (direction.equals("W")) {
                    coordinatesX -= 1;
                }

                if (direction.equals("S")) {
                    coordinatesY -= 1;
                }

                if (direction.equals("E")) {
                    coordinatesX += 1;
                }

                continue;
            }

            if (command.equals("L")) {
                nowPos = nowPos + 1;

                if (nowPos > 3) {
                    nowPos = 0;
                }
            }
            if (command.equals("R")) {
                nowPos = nowPos - 1;
                if (nowPos < 0) {
                    nowPos = 3;
                }
            }
            direction = directions.get(nowPos);

        }
    }


    public int getX() {
        return coordinatesX;
    }

    public int getY() {
        return coordinatesY;
    }

    public String getDirection() {
        return direction;
    }
}
