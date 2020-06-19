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


        while (guessNumberGame.getStatus().equals(GameStatus.CONTINUE)) {
            System.out.println("输入");
            String text = scanner.nextLine();
            String result = guessNumberGame.guess(text);

            // todo 对输入字符进行异常情况判断与处理

            System.out.println(result);
        }
    }
}
