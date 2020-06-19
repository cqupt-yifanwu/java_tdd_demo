package com.twschool.practice;

import java.util.Arrays;
import java.util.List;

public class MarsCar {
    private final MarsPosition position;

    public MarsCar(MarsPosition marsPosition) {
        this.position = marsPosition;
    }

    public void execute(List<String> args) {
        for(int index = 0; index < args.size(); index ++) {
            String command = args.get(index);
            Direction direction = position.getDirection();
            if (command.equals("M")) {
                if (direction.equals(Direction.N)) {
                    position.changeCoordinatesY("add");
                }

                if (direction.equals(Direction.W)) {
                    position.changeCoordinatesX("minus");
                }

                if (direction.equals(Direction.S)) {
                    position.changeCoordinatesY("minus");
                }

                if (direction.equals(Direction.E)) {
                    position.changeCoordinatesX("add");
                }

                continue;
            }

            if (command.equals("L")) {
                position.setDirection(direction.turnLeft());
            }
            if (command.equals("R")) {
                position.setDirection(direction.turnRight());
            }

        }
    }
}
