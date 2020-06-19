package com.twschool.practice;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public enum Direction {
    N, W, S, E;

    public Direction turnLeft () {
        int nowPos = this.ordinal();
        nowPos = nowPos + 1;

        if (nowPos > 3) {
            nowPos = 0;
        }

        return getValues()[nowPos];
    }

    private Direction[] getValues() {
        return Direction.values();
    }

    public Direction turnRight () {
        int nowPos = this.ordinal();
        nowPos = nowPos - 1;

        if (nowPos < 0) {
            nowPos = 3;
        }

        return getValues()[nowPos];
    }
}
