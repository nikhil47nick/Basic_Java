package com.bridgelabz.Day4.SnakeAndLadder;

import java.util.Random;

public class UC7 {
    public static final int ladder=1,snake=2;

    public static int play(int player){

        double dice = Math.random()*6+1;
        double play = Math.random()*3+1;
        switch ((int)play) {
            case ladder:
                player = player + (int)dice;
                break;
            case snake:
                player = player - (int)dice;
                break;
            default:
                player = player + 0;
        }
        if (player <100 && player >0) {
            System.out.println("out");
            return player;
        }else if (player < 0){
            System.out.println("in");
            player=0;
            return player;
        }else{
            System.out.println("done");
            int n = player-(int)dice;
            return  n;
        }
    }

    public static void main(String[] args) {
        int player1Pos = 0;
        int player2Pos = 0;
        int win = 0;
        int count=0;

        while (win == 0) {
            count++;
            if (player1Pos == 100){
                win = 1;
                System.out.println("Player 1 Win");
            }else if (player2Pos == 100){
                win = 1;
                System.out.println("Player 2 Win");
            }
           player1Pos =player1Pos + play(player1Pos);
            System.out.println(""+player1Pos);
           player2Pos =player2Pos + play(player2Pos);
            System.out.println(""+player2Pos);

        }
        System.out.println("Total count"+count);
    }
}
