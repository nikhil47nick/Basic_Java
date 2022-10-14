package com.bridgelabz.Day3;

public class ArrayInReverse {

    public static void main(String[] args) {
        int array_one[] = new int[]{55, 22, 33, 44, 55, 66, 77, 22, 33, 44, 55};
        int max=array_one[0];
        System.out.println("Array In Reverse Order");
        for (int i = array_one.length-1;i>=0;i--)
        {
            System.out.println(""+array_one[i]);
        }

    }
}
