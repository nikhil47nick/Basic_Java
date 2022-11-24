package com.bridgelabz.Day8;

import java.util.Scanner;

public class newArray {

    public void div57(int[] Array){


        int[] div_5 = new int[10];
        int[] div_7 = new int[10];
        int j=0,k=0;
        for(int i=0;i<10;i++) {

            if(Array[i] % 5 == 0){
                System.out.println(""+Array[i]);
                div_5[j] = Array[i];
                j++;
            }else if (Array[i] % 7 == 0){
                System.out.println(""+Array[i]);
                div_7[k] = Array[i];
                k++;
            }
        }

        for(int i=0;i<10;i++) {
            System.out.println("Divisible by 5 Array Data : "+ div_5[i]);
            System.out.println("Divisible by 7 Array Data : "+ div_7[i]);
        }

    }


    public static void main(String[] args){
        int[] Array= new int[10];
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter value for data");
        for(int i=0;i<10;i++) {
            Array[i] = scr.nextInt();
        }
        newArray new1 = new newArray();
        new1.div57(Array);
    }
}
