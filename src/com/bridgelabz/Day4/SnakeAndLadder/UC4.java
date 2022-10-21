package com.bridgelabz.Day4.SnakeAndLadder;

import java.util.Random;

public class UC4 {

    public static final int ladder=1,snake=2;

    public static void main(String[] args){
        int player1Pos = 0;
        int dice = (int)(Math.random()*6+1);
        int play = (int)(Math.random()*2);

        while(player1Pos<100) {

            switch (play) {
                case ladder:
                    player1Pos = player1Pos + dice;
                    System.out.println("1"+player1Pos);
                    break;
                case snake:
                    player1Pos = player1Pos - dice;
                    System.out.println("2"+player1Pos);
                    break;
                default:
                    player1Pos = player1Pos + 0;
                    System.out.println(""+player1Pos);
            }
            if(player1Pos<0){
                player1Pos = 0;
            }
        }
    }

}
