package com.twschool.practice;

import java.util.Arrays;
import java.util.List;

public class MarsCar {
    private int coordinatesX;
    private int coordinatesY;
    private Direction direction;
    private MarsPosition position;

//    private List<String> directions = Arrays.asList("N", "W", "S", "E");

    public MarsCar(MarsPosition marsPosition) {
        this.position = marsPosition;
        this.coordinatesX = marsPosition.getCoordinatesX();
        this.coordinatesY = marsPosition.getCoordinatesY();
        this.direction = marsPosition.getDirection();
    }

    public void execute(List<String> args) {
        for(int index = 0; index < args.size(); index ++) {
            String command = args.get(index);
            if (command.equals("M")) {
                if (direction.equals(Direction.N)) {
                    coordinatesY += 1;
                }

                if (direction.equals(Direction.W)) {
                    coordinatesX -= 1;
                }

                if (direction.equals(Direction.S)) {
                    coordinatesY -= 1;
                }

                if (direction.equals(Direction.E)) {
                    coordinatesX += 1;
                }

                continue;
            }

            if (command.equals("L")) {
                direction = direction.turnLeft();
            }
            if (command.equals("R")) {
                direction = direction.turnRight();
            }

        }
    }


    public int getX() {
        return coordinatesX;
    }

    public int getY() {
        return coordinatesY;
    }

    public Direction getDirection() {
        return direction;
    }
}
