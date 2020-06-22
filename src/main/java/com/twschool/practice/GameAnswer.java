package com.twschool.practice;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class GameAnswer {

    private String gameAnswer;

    public GameAnswer(String gameAnswer) {
        this.gameAnswer = gameAnswer;
    }

    public String getGameAnswer() {
        return gameAnswer;
    }

    public String check(String userAnswer) {
        List<String> arrayUserAnswer = Arrays.asList(userAnswer.split(""));
        List<String> arrayGameAnswer = Arrays.asList(gameAnswer.split(""));

        int aNumber = 0;
        int bNumber = 0;

        for(int i = 0; i < arrayUserAnswer.size(); i++ ) {
            String item = arrayUserAnswer.get(i);

            if (gameAnswer.contains(item)) {
                bNumber ++;
            }

            if (arrayGameAnswer.get(i).equals(arrayUserAnswer.get(i))) {
                aNumber ++;
            }
        }

        bNumber = bNumber - aNumber;

        return aNumber + "A" + bNumber + "B";
    }
}
