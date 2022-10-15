package com.bridgelabz.Day3;

public class ArrayOddPos {

    public static void main(String[] args) {
        int array_one[] = new int[]{55, 22, 33, 44, 55, 66, 77, 22, 33, 44, 55};
        int max=array_one[0];
        for (int i = 1;i<array_one.length;i=i+2)
        {
            System.out.println(i+" Position value : "+array_one[i]);
        }

    }
}
