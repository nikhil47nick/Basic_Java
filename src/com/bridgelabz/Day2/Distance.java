package com.bridgelabz.Day2;

import java.util.Scanner;

public class Distance {

    public static void main(String[] args){

        Scanner scr = new Scanner(System.in);
        System.out.println("Enter a Number for value a");
        int num1 = scr.nextInt();
        System.out.println("Enter a Number for value b");
        int num2 = scr.nextInt();

        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);

        double distance = Math.sqrt( Math.pow(x,2) + Math.pow(y,2) );

        System.out.println("Distance to (0,0) is  : "+ distance);

    }
}
