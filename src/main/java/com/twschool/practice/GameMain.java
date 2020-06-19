package com.twschool.practice;

import java.util.Scanner;

public class GameMain {
    public static void main(String[] args) {
        System.out.println("开始游戏");

//        初始化
        String gameGenerator = new GameGenerator().getNumber();
        GameAnswer gameAnswer = new GameAnswer(gameGenerator);
        GuessNumberGame guessNumberGame = new GuessNumberGame(gameAnswer);

        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        while (guessNumberGame.getStatus().equals(GameStatus.CONTINUE)) {
            guessNumberGame.guess(text);
        }
    }
}
